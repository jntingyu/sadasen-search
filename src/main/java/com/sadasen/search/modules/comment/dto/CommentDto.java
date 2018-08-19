package com.sadasen.search.modules.comment.dto;

import com.sadasen.search.base.BaseBean;

/**
 * @date 2018年8月18日
 * @author lei.ys
 * @addr home
 * @desc
 */
public class CommentDto extends BaseBean {

	private static final long serialVersionUID = -4255256339440724618L;
	
	private long postId;
	private String content;
	
	public CommentDto() {
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
