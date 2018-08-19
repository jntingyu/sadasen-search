package com.sadasen.search.modules.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.core.common.GlobalConsts;
import com.sadasen.core.response.JsonResult;
import com.sadasen.search.base.BaseController;
import com.sadasen.search.modules.user.dto.UserDto;
import com.sadasen.search.modules.user.entity.User;
import com.sadasen.search.modules.user.service.UserService;
import com.sadasen.util.DateUtil;

/**
 * @date 2018年8月15日
 * @author lei.ys
 * @addr home
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public JsonResult register(@RequestBody UserDto userDto) {
		User user = new User();
		user.setUserName(userDto.getUserName());
		user.setPassword(userDto.getPassword());
		user.setCreateTime(DateUtil.now());
		user = userService.save(user);
		return JsonResult.instance(user);
	}
	
	@PostMapping("/login")
	public JsonResult login(@RequestBody UserDto userDto) {
		User user = userService.findToLogin(userDto);
		super.getRequest().getSession().setAttribute(GlobalConsts.LOGIN_USER, user);
		return JsonResult.instance(user);
	}
	
	@GetMapping("/logout")
	public JsonResult logout() {
		super.getRequest().getSession().removeAttribute(GlobalConsts.LOGIN_USER);
		return JsonResult.instance();
	}
	
}
