package service;

import java.util.List;

import dao.MovieDAO;
import model.Movie;

public class MovieService {
	
	MovieDAO movieDAO = new MovieDAO();
	
	public List<Movie> listMovies() {
		return movieDAO.queryAllDb();
	}
	
	public Movie listMovieRandom() {
		return movieDAO.queryMovieRandom();
	}
	
	public List<Movie> findMoviesByCategoryId(Integer id) {
		return movieDAO.queryAllDbByCategoryId(id);
	}
	
	public Movie findMovieById(Integer id) {
		return movieDAO.queryAllById(id);
	}
	
	public boolean addMovie(Movie movie) {
		return movieDAO.insertMovie(movie);
	}
	
}
