package com.bilgeadam.repository;

import com.bilgeadam.repository.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository  extends MongoRepository<Movie,String> {
}
