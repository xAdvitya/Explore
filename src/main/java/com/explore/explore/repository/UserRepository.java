package com.explore.explore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.explore.explore.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUserName(String userName);
}
