package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.MovieRepository;
import com.cts.model.Movie;

@Service
public class MovieService_Impl {
	@Autowired
	MovieRepository movieRepo;
	
	public Movie addMovie(Movie mv) {
		return movieRepo.save(mv);
	}
	
	public List<Movie> getAllMovie(){
		List<Movie> movieList = movieRepo.findAll();
		return movieList;
	}
	
	public Movie getMovieById(Integer movie_id) {
		Movie mv = movieRepo.findById(movie_id).orElse(null);
		return mv;
	}
	
	public Movie getMovieByTitle(String title){
		Movie mv = movieRepo.getMovieByTitle(title);
		return mv;
	}

}
