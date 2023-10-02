package service;

import java.util.List;

import dao.CategoryDAO;
import model.Category;

public class CategoryService {
	
	CategoryDAO categoryDao = new CategoryDAO();
	
	public List<Category> listCategory() {
		return categoryDao.queryAllDb();
	}
	
	public Category listCategoryById(Integer id) {
		return categoryDao.querryAllDbById(id);
	}
	
}
