package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;

public class CategoryDAO {
	
	@SuppressWarnings("finally")
	public Category querryAllDbById(Integer id) {
		
		Connection cnx = Dao.getConnection();
		
		String sql = "SELECT * FROM categories WHERE id = ?";
		
		Category category = null;
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				category = new Category();
				
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				category.setImg(rs.getString("img"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return category;
		}
		
	}
	
	@SuppressWarnings("finally")
	public List<Category> queryAllDb() {
		
		Connection cnx = Dao.getConnection();
		
		List<Category> categorylist = new ArrayList<Category>();
		
		String sql = "SELECT * from categories";
		
		Category category;
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				category = new Category();
				
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				category.setImg(rs.getString("img"));
				
				categorylist.add(category);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {			
			return categorylist;
		}
		
	}
	
	public boolean insertCatergory(Category category) {
		
		Connection cnx = Dao.getConnection();
		
		boolean result = false;
	
		String sql = "INSERT INTO categories (name, img) VALUES (?,?) ";
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			ps.setString(1, category.getName());
			ps.setString(2, category.getImg());
			
			Integer i = ps.executeUpdate();
			
			result = i > 0 ? true : false; 

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
