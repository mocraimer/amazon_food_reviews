package food_reviews;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ConnectionPool {
    public static Connection getConnection() {
    	Connection conn = null;
        try {
        	String url = "jdbc:sqlite:testdb.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
   public static void main(String[] args) throws SQLException {
    	Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement("select productid,count(productid) text from reviews group by productid order by count(productid) DESC limit 1000");
        ResultSet res = ps.executeQuery();
        ArrayList<String> resList = Util.columnAsStringList(1, res);
       // Collections.sort(resList);
        System.out.println(resList);
        conn.close();
    }
}
