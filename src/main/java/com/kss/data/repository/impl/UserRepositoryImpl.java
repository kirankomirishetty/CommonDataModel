/**
 * 
 */
package com.kss.data.repository.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kss.data.entity.Users;
import com.kss.data.repository.UsersRepository;

/**
 * @author kiran
 *
 */
@Component
public class UserRepositoryImpl {

	UsersRepository usersRepository;
	EntityManager entityManager;
	
	@Autowired
	public UserRepositoryImpl(UsersRepository usersRepository, EntityManager entityManager) {
		super();
		this.usersRepository = usersRepository;
		this.entityManager = entityManager;
	}
	
	public List<Users> listAllUsers() {
		Iterable<Users> usersIterable = usersRepository.findAll();
		Iterator<Users> iterator = usersIterable.iterator();
		List<Users> usersList = new ArrayList<Users>();
		while(iterator.hasNext()) {
			usersList.add(iterator.next());
		}
		return usersList;
	}
	
	public Users findByUserName(String userName) {
		List<Users> usersList = listAllUsers();
		
		for (Users user:usersList){
			if (userName.equalsIgnoreCase(user.getUserName())) {
				return user;
			}
		}
		return null;
	}
	
	public boolean createUser(Users users) {
		Users createdUser = usersRepository.save(users);
		
		if(createdUser != null && users.getUserId().equalsIgnoreCase(createdUser.getUserId())){
			return true;
		}
		
		return false;
		
	}
	
	
	

}
