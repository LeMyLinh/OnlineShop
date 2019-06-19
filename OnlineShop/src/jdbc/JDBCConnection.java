package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class JDBCConnection {
	public static Connection getJDBCConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			SQLServerDriver drv = new SQLServerDriver(); 
			System.out.println(drv.getMajorVersion() + "." + drv.getMinorVersion());
			String user = "sa";
			String pass = "1";
			String url = "jdbc:sqlserver://localhost:1433;instance=MSSQLEXPRESS;databaseName=UNIFY";
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("thanh cong");
			
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		} 

		return connection;
	}
}
