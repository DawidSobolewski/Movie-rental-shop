package com.sobolewski.movierental.repository;

import com.sobolewski.movierental.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends JpaRepository<Movie,Integer> {
}
