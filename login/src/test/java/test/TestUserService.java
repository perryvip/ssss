package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.test.entity.User;
import com.test.service.UserService;

public class TestUserService {
	
	private UserService service;
	@Before
	public void init(){
		String[] conf={"conf/spring-mybatis.xml","conf/spring-mvc.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(conf);
		service=context.getBean("userService",UserService.class);
	}
	/**
	 * 测试结果:用户名错误
	 */
	@Test 
	public void test1() throws Exception{
		User user=service.login("zhang", "123456");
	}
	/**
	 * 测试结果:密码错误
	 */
	@Test 
	public void test2() throws Exception{
		User user=service.login("demo", "123");
	}
	/**
	 * 登录成功
	 */
	@Test 
	public void test3() throws Exception{
		User user=service.login("demo", "123456");
		System.out.println(user.getName()+","+user.getId());
	}
}
