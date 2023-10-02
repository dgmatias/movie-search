package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Movie;

public class MovieDAO {
	
	
	public List<Movie> QueryAllDbByCategoryId(Integer id) {
		
		Connection cnx = Dao.getConnection();
		
		List<Movie> listMovie = new ArrayList<Movie>();
		
		String sql = "SELECT * FROM movies WHERE category_id = ?";
		
		PreparedStatement ps;
		
		
		try {
			ps = cnx.prepareStatement(sql);	
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Movie movie = new Movie();
				
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setSinopse(rs.getString("sinopse"));
				movie.setDuration(rs.getString("duration"));
				movie.setImg_small(rs.getString("img_small"));
				movie.setImg_banner(rs.getString("img_banner"));
				movie.setCategory_id(rs.getInt("category_id"));
				
				listMovie.add(movie);
				
			}
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {			
			return listMovie;
		}
		
		
		
	}
	
	public Boolean insertMovie(Movie movie) {
		
		Boolean result = true;
		
		Connection cnx = Dao.getConnection();
		
		String sql = "INSERT INTO movies (name, sinopse, duration, img_small, img_banner, category_id) VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			
			ps.setString(1, movie.getName());
			ps.setString(2, movie.getSinopse());
			ps.setString(3, movie.getDuration());
			ps.setString(4, movie.getImg_small());
			ps.setString(5, movie.getImg_banner());
			ps.setInt(6, movie.getCategory_id());
			
			int i = ps.executeUpdate();
			
			result = i > 0 ? true : false; 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
