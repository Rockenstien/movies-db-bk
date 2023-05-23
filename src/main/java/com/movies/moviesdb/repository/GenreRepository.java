package com.movies.moviesdb.repository;

import org.springframework.data.repository.CrudRepository;

import com.movies.moviesdb.entity.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    
}
