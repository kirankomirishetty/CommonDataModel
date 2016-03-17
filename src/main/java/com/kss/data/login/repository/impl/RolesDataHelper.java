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

import com.kss.data.login.entity.Roles;
import com.kss.data.login.repository.RolesRepository;

/**
 * @author kiran
 *
 */
@Component
public class RolesDataHelper {


	RolesRepository rolesRepository;
	EntityManager entityManager;
	
	/**
	 * 
	 * @param usersRepository
	 * @param entityManager
	 */
	@Autowired
	public RolesDataHelper(RolesRepository usersRepository, EntityManager entityManager) {
		this.rolesRepository = usersRepository;
		this.entityManager = entityManager;
	}
	
	public List<Roles> getAllRoles(){
		Iterable<Roles> rolesIterable = rolesRepository.findAll();
		Iterator<Roles> iterator = rolesIterable.iterator();
		List<Roles> rolesList = new ArrayList<Roles>();
		while(iterator.hasNext()) {
			rolesList.add(iterator.next());
		}
		return rolesList;
		
	}
	
	public boolean addRole(Roles role) {
		Roles createdRole = rolesRepository.save(role);
		if (createdRole != null) {
			return true;
		}
		return false;
		
	}
	

}
