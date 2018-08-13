package com.sobolewski.movierental.service;

import com.sobolewski.movierental.model.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> findAll();
    Movie findMovieById(Integer id);
    List<String> findAllCategories();
    void saveMovie(Movie movie);
    void delete(Movie movie);


}
