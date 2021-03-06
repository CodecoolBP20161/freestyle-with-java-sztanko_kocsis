package Database;
import java.sql.*;

// this class represents the connection to an sqlite3 database and allows us to run queries on it.

public class SQLiteDatabase {

    private String URL;
    private String DRIVER;

    public SQLiteDatabase(String dataBaseName){
        this.DRIVER = "org.sqlite.JDBC";
        this.URL = "jdbc:sqlite:" + dataBaseName + ".db";
    }

    //creates and returns the connection object
    public Connection connection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //grabs the connection object,creates and return a statement object to run querys
    public Statement statementHandler() {
        Connection conn = this.connection();
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }

    // select all rows from the database
    public ResultSet selectAll() {
        Statement stmt = this.statementHandler();
        String sql = "SELECT * FROM userdata";
        ResultSet results = null;
        try {
            results = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    // creates the necessary predefined tables
    public void createTable()  {
        Statement stmt = this.statementHandler();

        String sql = "CREATE TABLE userdata "+
                "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " title VARCHAR(255), " +
                " username VARCHAR(255), " +
                " password VARCHAR(255), " +
                " url VARCHAR(255), " +
                " note VARCHAR(255));";

        try {
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {

        }
    }

    // method to insert new row into the table with prepared statement
    public void insert(String newTitle, String newUsername, String newPassword, String newUrl, String newNote)  {
        Connection conn = this.connection();
        String sql = "INSERT INTO userdata ("
                + " id,"
                + " title,"
                + " username,"
                + " password,"
                + " url,"
                + " note)VALUES ("
                + "null, ?, ?, ?, ?, ?)";

        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, newTitle);
            st.setString(2, newUsername);
            st.setString(3, newPassword);
            st.setString(4, newUrl);
            st.setString(5, newNote);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // method to update an existing row by ID
    public void update(int id,String title,String username,String password,String url,String note)  {
        Connection conn = this.connection();
        String sql = "UPDATE userdata SET title=?,username=?,password=?,url=?,note=? WHERE id=?;";
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, title);
            st.setString(2, username);
            st.setString(3, password);
            st.setString(4, url);
            st.setString(5, note);
            st.setInt(6, id);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



