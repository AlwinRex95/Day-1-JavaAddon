package Day12;


import java.sql.*;

public class Task1 {

	public static void main(String[] args) throws Exception {
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
				String Url="jdbc:mysql://localhost:3306/java";
				String UserName="root";
				String Password="";
				
				Connection connect=DriverManager.getConnection(Url, UserName, Password);
				System.out.println("Driver Loaded");

	}

}
