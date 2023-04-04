package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostsDao extends MongoRepository<Post, String>{

}
