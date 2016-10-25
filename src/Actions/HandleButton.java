package Actions;

import Database.SQLiteDatabase;
import Frames.MainFrame;

import java.sql.SQLException;

public class HandleButton {

    public void checkData(String dbName, String password) {
        if (dbName.length() > 0 && password.length()> 0) {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        }

    }

    public void saveData(String title, String user, String password, String url, String note) {
        SQLiteDatabase myDB = new SQLiteDatabase("kiscica");
        try {
            myDB.insert(title, user, password, url, note);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
