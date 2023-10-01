package app;

import java.util.List;

import dao.Dao;
import model.Category;
import service.CategoryService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao.getConnection();
		Category category = new Category();
		CategoryService categoryService = new CategoryService();
		//CategoryDAO categoryDao = new CategoryDAO();
		
		List<Category> categoryList =  categoryService.listCategory();
		
		categoryList.forEach(result -> System.out.println(result.toString()));
		
	}

}
