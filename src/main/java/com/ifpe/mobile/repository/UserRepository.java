package com.ifpe.mobile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifpe.mobile.models.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
