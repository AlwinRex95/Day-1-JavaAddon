package JDBCMain;

import java.sql.*;

public class newjdbc {

	public static void main(String[] args)throws Exception {

		//Class.forName("com.mysql.cj.jdbc.Driver");
		String Url="jdbc:mysql://localhost:3306/java";
		String UserName="root";
		String Password="";
		
		Connection connect=DriverManager.getConnection(Url, UserName, Password);
		System.out.println("Driver Loaded");
		
		int cid=03;
		String cname="WD";
		
		String sql="insert into course values(?,?)";
		PreparedStatement st =connect.prepareStatement(sql);
		st.setInt(1,cid);
		st.setString(2,cname);
		
		st.executeUpdate();		
//		Statement st=connect.createStatement();
//		
//		String sql="update course set cname='Cyber' where cid=01";
//		
//		st.executeUpdate(sql);
		System.out.println("data inserted done using prepared statements");
		connect.close();
//		
		
		//System.out.println("table created successfully");
		
//		ResultSet rs=st.executeQuery(sql);
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
		
//		rs.next();
//		
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		rs.next();
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		rs.next();
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		rs.next();
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		rs.next();
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		rs.next();
	}

}
