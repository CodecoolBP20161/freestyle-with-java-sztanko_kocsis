package Database;
import java.sql.ResultSet;

// State pattern to handle different database engines

public class StorageState {

    private SQLiteDatabase database;

    public void setDatabaseToSQLite(String databaseName) {
        this.database = new SQLiteDatabase(databaseName);
        this.database.createTable();

    }

    public void createTable(){
        this.database.createTable();
    }

    public ResultSet selectAll(){
        return this.database.selectAll();
    }

    public void insert(String newTitle, String newUsername, String newPassword, String newUrl, String newNote){
        this.database.insert(newTitle,newUsername,newPassword,newUrl,newNote);
    }

    public void update(int id,String title,String username,String password,String url,String note){
        this.database.update(id,title,username,password,url,note);
    }
}
