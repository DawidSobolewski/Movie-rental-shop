package com.sobolewski.movierental;

import com.sobolewski.movierental.model.Movie;
import com.sobolewski.movierental.model.MovieCategory;
import com.sobolewski.movierental.repository.IMovieRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@ComponentScan(basePackages = "com.sobolewski")
@SpringBootApplication
public class MovieRentalApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(MovieRentalApplication.class, args);

        IMovieRepository movieRepository = context.getBean(IMovieRepository.class);
    }
}
