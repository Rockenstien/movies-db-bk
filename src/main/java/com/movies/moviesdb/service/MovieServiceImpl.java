package com.movies.moviesdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movies.moviesdb.entity.Movie;
import com.movies.moviesdb.repository.MovieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;
    
    public List<Movie> getMovies(int limit, int offset) {
        return (List<Movie>) movieRepository.getMovies(limit, offset);
    }
}
