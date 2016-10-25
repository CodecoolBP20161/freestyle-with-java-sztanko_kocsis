package Actions;

import Frames.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerformRefresh implements ActionListener {
    private MainFrame mainFrame;

    public PerformRefresh(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.mainFrame.setVisible(false);
        MainFrame refreshedMain = new MainFrame();
        refreshedMain.setVisible(true);

    }
}
