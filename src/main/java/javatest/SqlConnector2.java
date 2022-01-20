package javatest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



public class SqlConnector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/emp_relation";
		String username = "postgres";
		String password = "Bittu@009";
		
		Connection connection;
		try {
			connection = DriverManager.getConnection(url,username,password);
			String sql = "Select * from employee order by emp_id";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			int  count =0;
//			while(result.next()) {
//				int id = result.getInt("emp_id");
//				String name = result.getString("emp_name");
//				int mgr_id = result.getInt("mgr_id");
//				System.out.println(id + " " + name + " "+mgr_id +" "+ count++);
//				
//			}
			while(result.next()) {
				String data="";
//				for(int i=1;i<=3;i++) {
//					data+=result.getString(i)+"-";
//				}
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch( Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
		
		
		
	}

}
