package com.sadasen.search.modules.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.core.common.GlobalConsts;
import com.sadasen.core.response.JsonResult;
import com.sadasen.search.base.BaseController;
import com.sadasen.search.modules.post.dto.PostDto;
import com.sadasen.search.modules.post.entity.Post;
import com.sadasen.search.modules.post.service.PostService;
import com.sadasen.search.modules.user.entity.User;
import com.sadasen.util.DateUtil;

/**
 * @date 2018年8月16日
 * @author lei.ys
 * @addr home
 * @desc
 */
@RestController
@RequestMapping("/post")
public class PostController extends BaseController {
	
	@Autowired
	private PostService postService;
	
	@PostMapping()
	public JsonResult post(PostDto postDto) {
		Post post = new Post();
		User loginUser = (User) super.getRequest().getSession().getAttribute(GlobalConsts.LOGIN_USER);
		post.setUserId(loginUser.getId());
		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
		post.setCreateTime(DateUtil.now());
		post = postService.save(post);
		return JsonResult.instance(post);
	}

}
