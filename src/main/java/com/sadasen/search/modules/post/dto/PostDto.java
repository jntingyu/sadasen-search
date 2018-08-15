package com.sadasen.search.modules.post.dto;

import com.sadasen.search.base.BaseBean;

/**
 * @date 2018年8月16日
 * @author lei.ys
 * @addr home
 * @desc
 */
public class PostDto extends BaseBean {

	private static final long serialVersionUID = 4090448642537655233L;
	
	private String title;
	private String content;
	
	public PostDto() {
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
