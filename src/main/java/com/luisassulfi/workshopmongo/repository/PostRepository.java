package com.luisassulfi.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.luisassulfi.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
