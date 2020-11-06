package com.lch.springboot01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lch.springboot01.domain.User;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	private static Logger logger = LoggerFactory.getLogger("HelloController");
	@RequestMapping("/hello")
	public String index() {
		return "hello world";
	}

	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setUserName("小明");
		user.setPassWord("123");
		return user;
	}

	@PostMapping("/call_back")
	public String callbacktest(HttpServletRequest request) {
		logger.debug(request.getQueryString());
		return "haha";
	}

}
