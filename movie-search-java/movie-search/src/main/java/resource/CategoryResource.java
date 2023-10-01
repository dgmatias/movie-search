package resource;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import model.Category;
import service.CategoryService;

@Path("category")
public class CategoryResource {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list")
	public Response getCategory() {
		
		CategoryService categoryService = new CategoryService();
		List<Category> listCategory = categoryService.listCategory();
		
		Response response = Response.ok().entity(listCategory).build();
		
		return response;
	}
	
	
}
