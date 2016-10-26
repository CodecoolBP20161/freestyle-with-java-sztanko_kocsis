package Actions;

import Database.StorageState;
import Frames.MainFrame;
import Frames.PopupDialog;

// this class represents the different button behaviours

public class HandleButton {

    public boolean checkData(String dbName, String password) {
        if (dbName.length() > 0 && password.length() > 0) {
            MainFrame mainFrame = new MainFrame(dbName);
            mainFrame.setVisible(true);
            return true;
        } else {
            PopupDialog mydialog = new PopupDialog("Fill all fields!");
            return false;
        }
    }

    public void saveData(String dbName, String title, String user, String password, String url, String note) {
        StorageState myDB = new StorageState();
        myDB.setDatabaseToSQLite(dbName);
        myDB.insert(title, user, password, url, note);
    }
}
