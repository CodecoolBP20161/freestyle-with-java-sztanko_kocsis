package Frames;

import Actions.PerformLogin;
import Actions.PerformExit;

import javax.swing.*;
import java.awt.*;

// this class represents the login window, child of Frame class

public class LoginFrame extends Frame {


    public LoginFrame() {
        initializeFrame();
        setLoginLayout();
    }

    public void setLoginLayout() {
        JPanel panelLabels = new JPanel();
        panelLabels.setLayout(new GridLayout(3, 2));

        JLabel textDBName = new JLabel("Database name:");
        panelLabels.add(textDBName);

        JTextField inputDBName = new JTextField();
        panelLabels.add(inputDBName, BorderLayout.EAST);

        JLabel textPassword = new JLabel("Password:");
        panelLabels.add(textPassword);

        JTextField inputPassword = new JTextField();
        panelLabels.add(inputPassword, BorderLayout.EAST);

        JButton buttonCancel = new JButton("Cancel");
        panelLabels.add(buttonCancel);
        buttonCancel.addActionListener(new PerformExit());

        JButton buttonSave = new JButton("Save");
        buttonSave.addActionListener(new PerformLogin(inputDBName, inputPassword, this));
        panelLabels.add(buttonSave);

        add(panelLabels);

        setVisible(true);
    }
}
