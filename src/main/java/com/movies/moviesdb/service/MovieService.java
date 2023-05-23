package com.movies.moviesdb.service;

import java.util.List;

import com.movies.moviesdb.entity.Movie;

public interface MovieService {
    List<Movie> getMovies(int limit, int offset);
}
