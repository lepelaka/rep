package data_inout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("");
			String url = "jdbc:oracle:thin:";
			String host = "";
			String user = "";
			String password = "";
			conn = DriverManager.getConnection(url + host, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
