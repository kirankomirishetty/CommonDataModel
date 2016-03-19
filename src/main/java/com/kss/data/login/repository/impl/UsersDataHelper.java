/**
 * 
 */
package com.kss.data.login.repository.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kss.data.exception.RecordNotExistsException;
import com.kss.data.login.entity.Users;
import com.kss.data.login.repository.UsersRepository;

/**
 * @author kiran
 *
 */
@Component
public class UsersDataHelper {

	UsersRepository usersRepository;
	EntityManager entityManager;
	
	@Autowired
	public UsersDataHelper(UsersRepository usersRepository, EntityManager entityManager) {
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
	
	public Users findByUserName(String userName) throws RecordNotExistsException {
		Users user = usersRepository.findByUserName(userName);

		if (user == null) {
			throw new RecordNotExistsException("Unable to find the user with login id ["+userName+"]");
		}
		return user;
	}
	
	public boolean isUserExists(String userName) {
		List<Users> usersList = listAllUsers();
		
		for (Users user:usersList){
			if (userName.equalsIgnoreCase(user.getUserName())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean createUser(Users users) {
		Users createdUser = usersRepository.save(users);
		
		if(createdUser != null && users.getUserId().equalsIgnoreCase(createdUser.getUserId())){
			return true;
		}
		
		return false;
		
	}
	
	
	

}
