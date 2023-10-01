package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	
	public static Connection getConnection() {
		
		Connection cnx = null;
		
		String driverName = "com.mysql.cj.jdbc.Driver";
			
		try {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "movieSearchDB";
			String user = "root";
			String password = "";
			
			String url = "jdbc:mysql://" + serverName + "/" + dataBase; 
			
			cnx = DriverManager.getConnection(url, user, password);
			
			if(cnx != null) {
				System.out.println("Conexão concluida com sucesso");
			} else {
				System.out.println("Houve alguma falha na conexão");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnx;
	}
	
}
