package com.employee.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.fullstackbackend.model.User;
public interface UserRepository extends JpaRepository<User,Long> {

	
	
}
