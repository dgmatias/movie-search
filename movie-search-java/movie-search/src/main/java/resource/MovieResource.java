package resource;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Movie;
import service.MovieService;

@Path("movie")
public class MovieResource {
	
	//http://localhost:8080/movie-search/rest/movie/listByCategoryId/1
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("listByCategoryId/{id}")
	public Response getMoviesByCategoryId(@PathParam("id") Integer id) {
		
		MovieService movieService = new MovieService();
		List<Movie> listMovie = movieService.findMoviesById(id);
		
		Response response = Response.ok().entity(listMovie).build();
		
		return response;
		
	}
	
}
