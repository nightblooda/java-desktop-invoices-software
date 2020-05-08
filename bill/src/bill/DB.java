package bill;
import java.sql.*;

public class DB {

	Connection con;
	Statement stmt;
	ResultSet rst;
	
	private void open() {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill","root","bonddoubleO7");
			stmt= con.createStatement();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	ResultSet executeQuery(String query) {
		
		try {
			open();
			rst= stmt.executeQuery(query);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rst;
	}
	
	int executeOther(String query) {
		int cnt=0;
		try {
			open();
			cnt= stmt.executeUpdate(query);
		}catch(SQLException e){
			e.printStackTrace();
		}
		close();
		return cnt;
	}
	
	void close() {
		try {
			stmt.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
