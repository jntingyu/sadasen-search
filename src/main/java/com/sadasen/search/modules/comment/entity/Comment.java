package com.sadasen.search.modules.comment.entity;

import org.beetl.sql.core.annotatoin.Table;

import com.sadasen.search.base.BaseEntity;

/**
 * @date 2018年8月18日
 * @author lei.ys
 * @addr home
 * @desc
 */
@Table(name="t_comment")
public class Comment extends BaseEntity {

	private static final long serialVersionUID = -6436959593123268606L;
	
	private long id;
	private long userId;
	private long postId;
	private String content;

	public Comment() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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
