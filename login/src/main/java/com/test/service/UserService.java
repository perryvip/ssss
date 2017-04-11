package com.test.service;


import com.test.entity.User;

public interface UserService {
	/**
	 * 登录接口
	 * 
	 */
	User login(String name,String password) throws Exception;
	/**
	 * 注册接口
	 */
	User regist(String name,String password,String nick)throws Exception;
}
