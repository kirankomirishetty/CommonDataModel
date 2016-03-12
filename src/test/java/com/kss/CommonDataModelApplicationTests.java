package com.kss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kss.data.CommonDataModelApplication;
import com.kss.data.repository.impl.UserRepositoryImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CommonDataModelApplication.class)
@WebAppConfiguration
public class CommonDataModelApplicationTests {

	@Autowired
	private UserRepositoryImpl userRepositoryImpl;
	
	@Test
	public void contextLoads() {
		System.out.println("Inside the testing...."+userRepositoryImpl);
		System.out.println("userRepositoryImpl "+userRepositoryImpl.listAllUsers());
	}

}
