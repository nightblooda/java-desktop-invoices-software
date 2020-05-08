package bill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sq {

	public static void main(String args[]) {
		Connection con= null;
		try {
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill", "root","bonddoubleO7");
			if(!con.isClosed())
				System.out.println("Successfully connected");
			}catch(Exception e) {
				System.err.println("Exception: "+ e.getMessage());
			}finally {
				try {
					if(con != null)
						con.close();
				}catch(SQLException e) {}
			}
		}
	}

