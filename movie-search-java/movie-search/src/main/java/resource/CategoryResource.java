package resource;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Category;
import service.CategoryService;

@Path("category")
public class CategoryResource {
	
	
	// http://localhost:8080/movie-search/rest/category/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list")
	public Response getCategory() {
		
		CategoryService categoryService = new CategoryService();
		List<Category> listCategory = categoryService.listCategory();
		
		Response response = Response.ok().entity(listCategory).build();
		
		return response;
	}
	
	
	// http://localhost:8080/movie-search/rest/category/category/3
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("category/{id}")
	public Response getCategoryById(@PathParam("id") Integer id) {
		
		CategoryService categoryService = new CategoryService();
		Category category = categoryService.listCategoryById(id);
		
		Response response = Response.ok().entity(category).build();
		
		return response;
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("category")
	public Response setCategory(Category category) {
		
		CategoryService categoryService = new CategoryService();
		boolean result = categoryService.addCategory(category);
		
		Response response = null;
		
		if(result) {
			response = Response.status(Response.Status.CREATED).entity("Categoria adicionada com sucesso!").build();
		} else {
			response = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Ocorreu algum erro!").build();
		}
		
		return response;
	}
	
}
