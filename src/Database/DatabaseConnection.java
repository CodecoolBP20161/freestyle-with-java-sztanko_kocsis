package Database;

import java.sql.*;


public class DatabaseConnection {

        private String URL;
        private String DRIVER;
        private String username;
        private String password;

    public DatabaseConnection(){
        this.DRIVER = "org.postgresql.Driver";
        this.URL = "jdbc:postgresql://localhost/passwordmanager3000";
        this.username = "code";
        this.password = "code";
    }

    public  Statement connect(){
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


    public  void createDatabase(String databaseName){
        Statement stmt = this.connect();
        String sql = "CREATE DATABASE " + databaseName;
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void execute(String query){
        Statement stmt = this.connect();
        try {
            ResultSet results = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable(){
        Statement stmt = this.connect();
        String sql = "CREATE TABLE userdata "+
                "(title VARCHAR(255), " +
                " username VARCHAR(255), " +
                " pass VARCHAR(255), " +
                " url VARCHAR(255), " +
                " note VARCHAR(255));";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void insert(String newTitle, String newUsername, String newPassword, String newUrl, String newNote){
        Statement stmt = this.connect();
        String sql = "INSERT INTO userdata VALUES("+newTitle+","+newUsername+","+newPassword+","+newUrl+","+newNote+");";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        DatabaseConnection newdb = new DatabaseConnection();
        newdb.createTable();
        newdb.insert("a","b","c","d","e");
    }


}



