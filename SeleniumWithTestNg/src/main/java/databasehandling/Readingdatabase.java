package databasehandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Readingdatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//connecttodb -- username ,password , driver
//fire queries
//close db
		String url = "jdbc:mysql://localhost:3306/";
		String driver = "com.mysql.jdbc.Driver";
                //"com.oracle.jdbc.Driver"
		String dbName = "agilenewdatabase";
		String username="root";
		String password="";
		Connection connection = DriverManager.getConnection(url+dbName, username, password);
	    System.out.println(connection.isClosed());
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery("select * from data");
	    rs.next();
	    System.out.println(rs.getString(1));
	    System.out.println(rs.getString(2));
	}

}
