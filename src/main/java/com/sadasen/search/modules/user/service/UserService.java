package com.sadasen.search.modules.user.service;

import com.sadasen.search.base.BaseService;
import com.sadasen.search.modules.user.dto.UserDto;
import com.sadasen.search.modules.user.entity.User;

/**
 * @date 2018年8月15日
 * @author lei.ys
 * @addr home
 * @desc
 */
public interface UserService extends BaseService<User> {
	
	public User findToLogin(UserDto userDto);

}
