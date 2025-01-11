package com.example.demo.controller;

import com.example.demo.modal.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movies")

public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies(){
        return  movieService.getAllMovies();
    }
    @PostMapping
    public Movie addMovie (@RequestBody Movie movie){
        System.out.println(movie.getMovieName());
        return  movieService.addMovie(movie);
    }
}
