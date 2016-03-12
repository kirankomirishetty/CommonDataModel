package com.kss.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kss.data.entity.Users;

public interface UsersRepository extends CrudRepository<Users, String>{
	
//	public List<Users> findByRole(String roleId);

}