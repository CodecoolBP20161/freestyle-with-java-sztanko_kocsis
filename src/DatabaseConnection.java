import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by code on 2016.10.24..
 */


    public class DatabaseConnection {

    static final String URL = "jdbc:postgresql://localhost/";
    static final String DRIVER = "org.postgresql.Driver";

    static final String username = "code";
    static final String password = "code";

    public  static Statement connect(){
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(URL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }


    public static void createDatabase(String databaseName){
        Statement stmt = DatabaseConnection.connect();
        String sql = "CREATE DATABASE " + databaseName;
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        DatabaseConnection.createDatabase("NEW");
    }
}



