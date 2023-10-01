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
	
}
