package com.movies.moviesdb.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.moviesdb.entity.Genre;
import com.movies.moviesdb.service.GenreService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/genre")
@AllArgsConstructor
public class GenreControllerV1 {

    private GenreService genreService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Genre>> getAllGenres() {
        return new ResponseEntity<List<Genre>>(genreService.getGenres(), HttpStatus.OK);
    }
}
