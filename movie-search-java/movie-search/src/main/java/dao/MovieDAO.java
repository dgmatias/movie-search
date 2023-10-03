package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Movie;

public class MovieDAO {
	
	public Movie queryMovieRandom() {
		
		Connection cnx = Dao.getConnection();
		
		String sql = "SELECT * FROM movies ORDER BY RAND() LIMIT 1";
		
		Movie movie = null;
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				movie = new Movie();
				
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setSinopse(rs.getString("sinopse"));
				movie.setDuration(rs.getString("duration"));
				movie.setImg_small(rs.getString("img_small"));
				movie.setImg_banner(rs.getString("img_banner"));
				movie.setCategory_id(rs.getInt("category_id"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return movie;
		
	}
	
	@SuppressWarnings("finally")
	public List<Movie> queryAllDb() {
		
		Connection cnx  = Dao.getConnection();
		
		List<Movie> movieList = new ArrayList<Movie>();
		
		String sql = "SELECT * FROM movies";
		
		Movie movie;
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				movie = new Movie();
				
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setSinopse(rs.getString("sinopse"));
				movie.setDuration(rs.getString("duration"));
				movie.setImg_small(rs.getString("img_small"));
				movie.setImg_banner(rs.getString("img_banner"));
				movie.setCategory_id(rs.getInt("category_id"));
				
				movieList.add(movie);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return movieList;
		}
		
	}
	
	@SuppressWarnings("finally")
	public Movie queryAllById(Integer id) {
		
		Connection cnx = Dao.getConnection();
		
		Movie movie = null;
		
		String sql = "SELECT * FROM movies WHERE id = ?";
		
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				movie = new Movie();
				
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setSinopse(rs.getString("sinopse"));
				movie.setDuration(rs.getString("duration"));
				movie.setImg_small(rs.getString("img_small"));
				movie.setImg_banner(rs.getString("img_banner"));
				movie.setCategory_id(rs.getInt("category_id"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {			
			return movie;
		}
		
		
	}
	
	@SuppressWarnings("finally")
	public List<Movie> queryAllDbByCategoryId(Integer id) {
		
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
	
	public boolean insertMovie(Movie movie) {
		
		boolean result = true;
		
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
