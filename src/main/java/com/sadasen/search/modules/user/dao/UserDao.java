package com.sadasen.search.modules.user.dao;

import org.beetl.sql.core.mapper.BaseMapper;

import com.sadasen.search.modules.user.dto.UserDto;
import com.sadasen.search.modules.user.entity.User;

/**
 * @date 2018年8月15日
 * @author lei.ys
 * @addr home
 * @desc
 */
public interface UserDao extends BaseMapper<User> {
	
	public User selectToLogin(UserDto userDto);

}
