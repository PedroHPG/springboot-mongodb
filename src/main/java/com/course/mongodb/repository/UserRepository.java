package com.course.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.course.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	
	
}
