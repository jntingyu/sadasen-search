package com.sadasen.search.base;

import java.util.Date;

/**
 * @date 2018年8月15日
 * @author lei.ys
 * @addr home
 * @desc
 */
public class BaseEntity extends BaseBean {

	private static final long serialVersionUID = 6095563695881712741L;
	
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
