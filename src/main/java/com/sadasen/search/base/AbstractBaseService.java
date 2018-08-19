package com.sadasen.search.base;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2018年8月18日
 * @author lei.ys
 * @param <T>
 * @addr home
 * @desc
 */
public abstract class AbstractBaseService<T> implements BaseService<T> {
	
	@Autowired
	private SQLManager sqlManager;

	public T save(T t) {
		sqlManager.insertTemplate(t, true);
		return t;
	}

}
