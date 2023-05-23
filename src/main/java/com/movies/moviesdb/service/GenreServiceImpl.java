package com.movies.moviesdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movies.moviesdb.entity.Genre;
import com.movies.moviesdb.repository.GenreRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {
    
    GenreRepository genreRepository;

    public List<Genre> getGenres() {
       return (List<Genre>) genreRepository.findAll();
    }
}
