package com.accenture.tests.useLogin.daos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accenture.userLogin.repository.dao.UserLoginDao;

@ContextConfiguration(locations = {"classpath:spring/aplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUserLoginDao {

	@Autowired
	UserLoginDao loginDao;
	@Test
	public void test() {
		System.out.println(loginDao);
		
	}
}
