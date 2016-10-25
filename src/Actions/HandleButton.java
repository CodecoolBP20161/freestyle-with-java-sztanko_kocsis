package Actions;

import Frames.MainFrame;

public class HandleButton {

    public void checkData(String dbName, String password) {
        if (dbName.length() > 0 && password.length()> 0) {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        }

    }
}
