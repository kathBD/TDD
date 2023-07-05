package com.practice.movies.data;

import com.practice.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

        Movie findById(long id);
        Collection<Movie> findAll();
        void saveOrUpdate(Movie movie);
    }


