package food_reviews;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    public static Connection getConnection() {
    	Connection  conn = null;
    	try {
        	String url = "jdbc:sqlite:database2.sqlite";
        	conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
