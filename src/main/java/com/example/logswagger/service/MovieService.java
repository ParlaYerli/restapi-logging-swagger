package com.example.logswagger.service;

import com.example.logswagger.entity.Movie;
import com.example.logswagger.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getMovie(){
        return movieRepository.findAll();
    }

    public void delete(int id){
        Movie movie = new Movie();
        movie.setId(id);
        movieRepository.delete(movie);
    }
}
