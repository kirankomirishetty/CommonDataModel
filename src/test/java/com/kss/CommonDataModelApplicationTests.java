package com.kss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kss.data.CommonDataModelApplication;
import com.kss.data.login.repository.UsersRepository;
import com.kss.data.login.repository.impl.RolesDataHelper;
import com.kss.data.login.repository.impl.UsersDataHelper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CommonDataModelApplication.class)
@WebAppConfiguration
public class CommonDataModelApplicationTests {

	@Autowired
	private UsersDataHelper userRepositoryImpl;
	@Autowired
	private UsersRepository userRepository;
	@Autowired
	private RolesDataHelper rolesDataHelper;
	
	@Test
	public void contextLoads() {
		System.out.println("Inside the testing...."+userRepositoryImpl);
		rolesDataHelper.getTables();
		System.out.println("userRepositoryImpl "+userRepositoryImpl.listAllUsers());
		System.out.println("User By Name "+userRepository.findByUserName("admin@gmail.com"));
	}
	
	@Test
	public void testRoles() {
		System.out.println("List of all the roles is "+rolesDataHelper.getAllRoles());
	}

}
