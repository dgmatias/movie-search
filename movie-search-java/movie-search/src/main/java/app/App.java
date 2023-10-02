package app;

import java.util.List;

import dao.CategoryDAO;
import model.Category;
import model.Movie;
import service.MovieService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dao.getConnection();
		Category category = new Category();
		CategoryDAO categoryDAO = new CategoryDAO();
		MovieService movieService = new MovieService();
		
		//category.setName("Drama");
		//category.setImg("drama.jpg");
		
		//categoryDAO.insertCatergory(category);
		//Movie movie = new Movie();
		
		//movie.setName("Filme 4 ");
		//movie.setSinopse("Sinopse 4");
		//movie.setDuration("2:30");
		//movie.setImg_small("img_small4.jpg");
		//movie.setImg_banner("img_banner4.jpg");
		//movie.setCategory_id(1);
		
		//MovieDAO movieDAO = new MovieDAO();
		List<Movie> listMovie = movieService.listMovies();
		listMovie.forEach(result -> System.out.println(result.toString()));
		
		//System.out.println(movieDAO.queryAllById(2));
		
		//movieDAO.insertMovie(movie);
		
		//CategoryService categoryService = new CategoryService();
		//CategoryDAO categoryDao = new CategoryDAO();
		//System.out.println(categoryDao.querryAllDbById(2));
		//List<Category> categoryList =  categoryService.listCategory();
		
		//categoryList.forEach(result -> System.out.println(result.toString()));
		
	}

}
