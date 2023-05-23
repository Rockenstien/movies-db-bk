package com.movies.moviesdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.movies.moviesdb.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    @Query(value = "SELECT * FROM movie ORDER BY id LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<Movie> getMovies(@Param("limit") int limit, @Param("offset") int offset);
}
