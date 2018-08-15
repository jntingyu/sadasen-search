package com.sadasen.search.modules.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadasen.search.modules.user.dao.UserDao;
import com.sadasen.search.modules.user.dto.UserDto;
import com.sadasen.search.modules.user.entity.User;
import com.sadasen.search.modules.user.service.UserService;

/**
 * @date 2018年8月15日
 * @author lei.ys
 * @addr home
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User save(User user) {
		userDao.insertTemplate(user, true);
		return user;
	}

	@Override
	public User findToLogin(UserDto userDto) {
		return userDao.selectToLogin(userDto);
	}

}
