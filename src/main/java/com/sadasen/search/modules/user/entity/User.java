package com.sadasen.search.modules.user.entity;

import org.beetl.sql.core.annotatoin.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sadasen.search.base.BaseEntity;

/**
 * @date 2018年8月15日
 * @author lei.ys
 * @addr home
 * @desc
 */
@Table(name="sys_user")
public class User extends BaseEntity {

	private static final long serialVersionUID = 8316961083397968543L;
	
	private long id;
	private String userName;
	@JsonIgnore
	private String password;
	
	public User() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
