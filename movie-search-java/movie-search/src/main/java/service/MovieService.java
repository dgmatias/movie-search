package service;

import java.util.List;

import dao.MovieDAO;
import model.Movie;

public class MovieService {
	
	MovieDAO movieDAO = new MovieDAO();
	
	public List<Movie> findMoviesById(int id) {
		return movieDAO.QueryAllDbByCategoryId(id);
	}
	
}
