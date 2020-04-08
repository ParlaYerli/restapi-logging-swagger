package com.example.logswagger.controller;

import com.example.logswagger.entity.Movie;
import com.example.logswagger.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    Logger logger = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    MovieService movieService;

    @PostMapping("/save")
    public Movie save(@RequestBody @Valid Movie movie){
        logger.debug("SUCCESSFULLY!!! LOOK... SAVE MOVIE ..");
        return movieService.save(movie);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        logger.debug("SUCCESSFULLY!!! LOOK... DELETE MOVIE!!!..");
        movieService.delete(id);
    }

    @GetMapping("/list")
    public List<Movie> getList(){
        logger.debug("SUCCESSFULLY !!! LOOK...LIST MOVIES! ");
        return movieService.getMovie();
    }

}
