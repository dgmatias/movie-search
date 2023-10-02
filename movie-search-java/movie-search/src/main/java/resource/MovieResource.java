package resource;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Movie;
import service.MovieService;

@Path("movie")
public class MovieResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("list")
	public Response getMovies() {
		MovieService movieService = new MovieService();
		List<Movie> listMovie = movieService.listMovies();
		
		Response response = Response.ok().entity(listMovie).build();
		
		return response;
	}
	
	
	//http://localhost:8080/movie-search/rest/movie/listByCategoryId/1
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("listByCategoryId/{id}")
	public Response getMoviesByCategoryId(@PathParam("id") Integer id) {
		
		MovieService movieService = new MovieService();
		List<Movie> listMovie = movieService.findMoviesByCategoryId(id);
		
		Response response = Response.ok().entity(listMovie).build();
		
		return response;
	}
	
	// http://localhost:8080/movie-search/rest/movie/movie/1
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("movie/{id}")
	public Response getMoviesById(@PathParam("id") Integer id) {
		
		MovieService movieService = new MovieService();
		Movie movie = movieService.findMovieById(id);
		
		Response response = Response.ok().entity(movie).build();
		
		return response;
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("movie")
	public Response setMovie(Movie movie) {
		
		MovieService movieService = new MovieService();
		boolean result = movieService.addMovie(movie);
		
		Response response = null;
		
		if(result) {
			response = Response.status(Response.Status.CREATED).entity("Filme adicionado com sucesso!").build();
		} else {
			response = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Ocorreu algum erro!").build();
		}
		
		return response;
	}
	
}
