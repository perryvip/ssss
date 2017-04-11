package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.util.UserUtil;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;
	
	public User login(String name, String password) throws Exception {
		if(name == null || name.trim().isEmpty()){
			throw new Exception("用户名不能为空");
		}
		if(password == null || password.trim().isEmpty()){
			throw new Exception("密码不能为空");
		}
		/**
		 * 1.利用用户名查找用户信息
		 * 2.检验用户密码是否正确
		 */
		//
		User user=userDao.selectByPrimaryKey(name);
		/*
		 * System.out.println(user);
		 */
		if(user == null){
			throw new Exception("用户名错误");
		}
		if(user.getPassword().equals(password)){
			return user;
		}else{
			throw new Exception("密码错误");
		}
	}

	@Override
	public User regist(String name, String password, String nick)throws Exception {
		User user=userDao.selectByPrimaryKey(name);
		if(user!=null){
			throw new Exception("用户被占用");
		}
		if(nick==null||nick.trim().isEmpty()){
			nick=name;
		}
		String id = UserUtil.createId();
		String token = "";
		user = new User(id,name,password,token,nick);
		userDao.insert(user);
		return user;
		
	}

}
