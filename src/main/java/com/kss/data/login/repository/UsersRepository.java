package com.kss.data.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.kss.data.login.entity.Users;

public interface UsersRepository extends CrudRepository<Users, String>{
	
	@Query("FROM Users WHERE userName=?1")
	public Users findByUserName(String userName);
	

}