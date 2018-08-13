package com.sobolewski.movierental.controller;


import com.sobolewski.movierental.model.Movie;
import com.sobolewski.movierental.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private IMovieService movieService;

    @Autowired
    public HomeController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/")
    public String show() {
        return "index";
    }

    @RequestMapping("/showMovies")
    public String showMovies(Model model) {
        model.addAttribute("movies", movieService.findAll());
        return "showMovies";
    }

    @RequestMapping("/addMovie/view")
    public String addMovieView(Model model) {
        model.addAttribute("categories",movieService.findAllCategories());
        model.addAttribute("movie", new Movie());
        return "addMovie";
    }

    @PostMapping("/addMovie")
    public String addMovie(@ModelAttribute Movie movie){
        movieService.saveMovie(movie);
        return "redirect:/showMovies";
    }

    @RequestMapping("/deleteMovie/view")
    public String deleteMovieView(Model model){
        model.addAttribute("movies", movieService.findAll());
        return "deleteMovies";
    }

    @RequestMapping("/updateMovie/view")
    public String updateMovieView(Model model){
        model.addAttribute("movies", movieService.findAll());
        return "updateMovie";
    }

    @PostMapping("/deleteMovie")
    public String deleteMovie(@ModelAttribute Movie movie){
        movieService.delete(movie);
        return "redirect:/deleteMovie/view";
    }
}
