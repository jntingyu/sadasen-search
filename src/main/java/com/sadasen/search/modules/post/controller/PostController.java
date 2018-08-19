package com.sadasen.search.modules.post.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.core.common.GlobalConsts;
import com.sadasen.core.response.JsonResult;
import com.sadasen.search.base.BaseController;
import com.sadasen.search.common.Consts;
import com.sadasen.search.modules.post.dto.PostDto;
import com.sadasen.search.modules.post.entity.Post;
import com.sadasen.search.modules.post.service.PostService;
import com.sadasen.search.modules.post.vo.PostIndexVo;
import com.sadasen.search.modules.user.entity.User;
import com.sadasen.search.settings.ElasticsearchSetting;
import com.sadasen.search.util.OkHttpUtil;
import com.sadasen.util.DateUtil;
import com.sadasen.util.StringUtil;

import ch.qos.logback.classic.Logger;

/**
 * @date 2018年8月16日
 * @author lei.ys
 * @addr home
 * @desc
 */
@RestController
@RequestMapping("/post")
public class PostController extends BaseController {
	
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(PostController.class);
	
	@Autowired
	private PostService postService;
	@Autowired
	private ElasticsearchSetting elasticsearchSetting;
	
	@PostMapping()
	public JsonResult post(@RequestBody PostDto postDto) {
		Post post = new Post();
		User loginUser = (User) super.getRequest().getSession().getAttribute(GlobalConsts.LOGIN_USER);
		// test
		loginUser = new User();
		loginUser.setId(1L);
		loginUser.setUserName("leiys13");
		post.setUserId(loginUser.getId());
		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
		post.setCreateTime(DateUtil.now());
		post = postService.save(post);
		PostIndexVo postIndexVo = new PostIndexVo(post);
		postIndexVo.setUserName(loginUser.getUserName());
		String postIndexUrl = StringUtil.concat("/", elasticsearchSetting.getServer(),
				Consts.Elasticsearch.INDEX_ARTICLE,
				Consts.Elasticsearch.TYPE_POST, post.getId()+"");
		LOG.info("index url : {}", postIndexUrl);
		OkHttpUtil.asynPost(postIndexUrl, postIndexVo.toString());
		return JsonResult.instance(post);
	}

}
