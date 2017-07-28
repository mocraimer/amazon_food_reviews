package food_reviews;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
	static Connection  conn = null;
	public static Connection getConnection() {
		if(conn == null) {
			try {
				String url = "jdbc:sqlite:database.sqlite";
				conn = DriverManager.getConnection(url);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
			return conn;
	}
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}