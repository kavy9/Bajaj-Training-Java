package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlconnector {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JDBCurl ="jdbc:postgresql://localhost:5432/Test";
		String username ="postgres";
		String database ="";
		String password = "Bittu@009";
		
		try {
			Connection connection = DriverManager.getConnection(JDBCurl,username,password);
			//System.out.println("Connected !!!");
			String sql ="SELECT * from contacts";
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery(sql);
			while(results.next()) {
				int id =results.getInt("id");

				String name =results.getString("name");

				String email =results.getString("email");
				
				System.out.println(id+"-"+name+"-"+email);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error while connecting to sql");
			e.printStackTrace();
		} 
	}

}
