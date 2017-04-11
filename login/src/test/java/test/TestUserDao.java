package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.UserDao;
import com.test.entity.User;

public class TestUserDao {
	/**
	 * 登录查询
	 */
	@Test
	public void testFindByName(){
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		UserDao dao = context.getBean("userDao",UserDao.class);
		User user = dao.selectByPrimaryKey("demo");
		System.out.println(user.getId());
	}
	/**
	 * 添加数据（注册）
	 */
	@Test
	public void testAddUser(){
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		UserDao dao = context.getBean("userDao",UserDao.class);
		User user = new User("111111","Jack","123456","","JJ");
		dao.insert(user);
	}
}