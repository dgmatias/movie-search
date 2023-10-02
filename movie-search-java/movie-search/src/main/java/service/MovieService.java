package service;

import java.util.List;

import dao.MovieDAO;
import model.Movie;

public class MovieService {
	
	MovieDAO movieDAO = new MovieDAO();
	
	public List<Movie> findMoviesByCategoryId(Integer id) {
		return movieDAO.queryAllDbByCategoryId(id);
	}
	
	public Movie findMovieById(Integer id) {
		return movieDAO.queryAllById(id);
	}
	
}
