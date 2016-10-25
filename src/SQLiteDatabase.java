import java.sql.*;

public class SQLiteDatabase {

    private String URL;
    private String DRIVER;


    public SQLiteDatabase(String dataBaseName){
        this.DRIVER = "org.sqlite.JDBC";
        this.URL = "jdbc:sqlite:"+dataBaseName+".db";
    }

    public Connection connection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL);
        return conn;
    }

    public Statement statementHandler() throws SQLException, ClassNotFoundException {
        Connection conn = this.connection();
        Statement stmt = null;
        stmt = conn.createStatement();
        return stmt;
    }

    public ResultSet selectAll() throws SQLException, ClassNotFoundException {
        Statement stmt = this.statementHandler();
        String sql = "SELECT * FROM userdata";
        ResultSet results = stmt.executeQuery(sql);
        return results;
    }

    public void createTable() throws SQLException, ClassNotFoundException {
        Statement stmt = this.statementHandler();

        String sql = "CREATE TABLE userdata "+
                "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " title VARCHAR(255), " +
                " username VARCHAR(255), " +
                " password VARCHAR(255), " +
                " url VARCHAR(255), " +
                " note VARCHAR(255));";

            stmt.executeUpdate(sql);
            stmt.close();


    }
    public void insert(String newTitle, String newUsername, String newPassword, String newUrl, String newNote) throws SQLException, ClassNotFoundException {
        Connection conn = this.connection();
        String sql = "INSERT INTO userdata ("
                + " id,"
                + " title,"
                + " username,"
                + " password,"
                + " url,"
                + " note)VALUES ("
                + "null, ?, ?, ?, ?, ?)";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, newTitle);
            st.setString(2, newUsername);
            st.setString(3, newPassword);
            st.setString(4, newUrl);
            st.setString(5, newNote);
            st.executeUpdate();
            st.close();

    }

    public void update(int id,String title,String username,String password,String url,String note) throws SQLException, ClassNotFoundException {
        Connection conn = this.connection();
        String sql = "UPDATE userdata SET title=?,username=?,password=?,url=?,note=? WHERE id=?;";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, title);
        st.setString(2, username);
        st.setString(3, password);
        st.setString(4, url);
        st.setString(5, note);
        st.setInt(6, id);
        st.executeUpdate();
        st.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SQLiteDatabase newdb = new SQLiteDatabase("newWorld");
        newdb.createTable();

    }


}



