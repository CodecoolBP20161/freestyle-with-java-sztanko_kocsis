package Actions;

import Frames.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// this class is responsible for rebuilding and refreshing main window with up-to-date rows

public class PerformRefresh implements ActionListener {
    MainFrame mainFrame;

    public PerformRefresh(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.mainFrame.setVisible(false);
        MainFrame refreshedMain = new MainFrame(this.mainFrame.getDbName());
        refreshedMain.setVisible(true);

    }
}
