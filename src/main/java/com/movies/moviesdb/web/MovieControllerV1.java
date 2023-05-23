package com.movies.moviesdb.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movies.moviesdb.entity.Movie;
import com.movies.moviesdb.service.MovieService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/movie")
@AllArgsConstructor
public class MovieControllerV1 {
    
    private MovieService movieService;

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getMovies(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
        return new ResponseEntity<List<Movie>>(movieService.getMovies(limit, offset), HttpStatus.OK);
    }
}
