package com.sadasen.search.modules.post.entity;

import org.beetl.sql.core.annotatoin.Table;

import com.sadasen.search.base.BaseEntity;

/**
 * @date 2018年8月16日
 * @author lei.ys
 * @addr home
 * @desc
 */
@Table(name="t_post")
public class Post extends BaseEntity {

	private static final long serialVersionUID = 4080756678140689827L;
	
	private long id;
	private long userId;
	private String title;
	private String content;
	
	public Post() {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
