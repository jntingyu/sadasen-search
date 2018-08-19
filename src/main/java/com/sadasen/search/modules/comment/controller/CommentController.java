package com.sadasen.search.modules.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.core.common.GlobalConsts;
import com.sadasen.core.response.JsonResult;
import com.sadasen.search.base.BaseController;
import com.sadasen.search.modules.comment.dto.CommentDto;
import com.sadasen.search.modules.comment.entity.Comment;
import com.sadasen.search.modules.comment.service.CommentService;
import com.sadasen.search.modules.user.entity.User;
import com.sadasen.util.DateUtil;

/**
 * @date 2018年8月18日
 * @author lei.ys
 * @addr home
 * @desc
 */
@RestController
@RequestMapping("/comment")
public class CommentController extends BaseController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping
	public JsonResult addComment(@RequestBody CommentDto commentDto) {
		Comment comment = new Comment();
		User loginUser = (User) super.getRequest().getSession().getAttribute(GlobalConsts.LOGIN_USER);
		comment.setUserId(loginUser.getId());
		comment.setPostId(commentDto.getPostId());
		comment.setContent(commentDto.getContent());
		comment.setCreateTime(DateUtil.now());
		comment = commentService.save(comment);
		return JsonResult.instance(comment);
	}

}
