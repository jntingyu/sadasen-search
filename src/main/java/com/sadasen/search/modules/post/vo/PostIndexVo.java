package com.sadasen.search.modules.post.vo;

import java.util.Date;

import com.sadasen.search.base.BaseBean;
import com.sadasen.search.modules.post.entity.Post;

/**
 * @date 2018年8月19日
 * @author lei.ys
 * @addr home
 * @desc
 */
public class PostIndexVo extends BaseBean {
	
	private static final long serialVersionUID = 6805744146951045424L;
	
	private long id;
	private String userName;
	private String title;
	private String content;
	private Date createTime;
	
	public PostIndexVo() {
	}
	
	public PostIndexVo(Post post) {
		this.id = post.getId();
		this.title = post.getTitle();
		this.content = post.getContent();
		this.createTime = post.getCreateTime();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
