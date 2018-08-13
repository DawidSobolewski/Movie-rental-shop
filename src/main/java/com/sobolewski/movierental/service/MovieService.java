package com.sobolewski.movierental.service;

import com.sobolewski.movierental.model.Movie;
import com.sobolewski.movierental.model.MovieCategory;
import com.sobolewski.movierental.repository.IMovieRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements IMovieService {

    private IMovieRepository movieRepository;

    public MovieService(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findMovieById(Integer id) {
        return null;
    }

    @Override
    public List<String> findAllCategories() {
        return Arrays.stream(MovieCategory.values()).map(Enum::name).collect(Collectors.toList());
    }

    @Override
    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie) {
        movieRepository.delete(movie);
    }
}
