package com.claytonandrade.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.claytonandrade.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {}