package Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// this class redirects from login window to main window

public class PerformLogin implements ActionListener {

    private JTextField dbName;
    private JTextField password;
    private Frame current;

    public PerformLogin(JTextField dbName, JTextField password, Frame current) {
        this.dbName = dbName;
        this.password = password;
        this.current = current;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String dbNameAsText = this.dbName.getText();
        String passwordAsText = this.password.getText();
        HandleButton buttonHandler = new HandleButton();
        buttonHandler.checkData(dbNameAsText, passwordAsText);
        this.current.dispose();
    }
}
