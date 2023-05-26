package com.movies.moviesdb.entity;

import java.util.List;

import com.movies.moviesdb.entity.Genre;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private String title;

    @Nonnull
    private Integer year;
    
    @Nonnull
    private Integer runtime;

    @Nonnull
    private String director;

    @Nonnull
    private String actors;

    private String plot;

    private String posterUrl;

    @ManyToOne
    @JoinTable(
        name = "movie_genre",
        joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name="genre_id", referencedColumnName = "id")
    )
    private List<Genre> genres;
}
