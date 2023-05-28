package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.Movie;
//import com.cts.service.MovieService_Impl;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	@Query(value = "SELECT * from movie where title=:title", nativeQuery = true)
	public Movie getMovieByTitle(String title); //Check Error
}
