package Frames;

import Actions.PerformExit;
import Actions.PerformRefresh;
import Database.SQLiteDatabase;
import Actions.PerformAddNewRow;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainFrame extends Frame {
    private String[] listOfLabels = {"Title", "User", "Password", "URL", "Note"};

    public MainFrame() {
        initializeFrame();
        setLoginLayout();

    }

    public void setLoginLayout() {
        JPanel panelLabels = new JPanel();

        panelLabels.setLayout(new GridLayout(2, 5));
        JButton addButton = new JButton("Add");
        JButton refreshButton = new JButton("Refresh");
        JButton exitButton = new JButton("Exit");

        panelLabels.add(addButton);

        panelLabels.add(new JLabel(" "));

        panelLabels.add(refreshButton);

        panelLabels.add(new JLabel(" "));

        panelLabels.add(exitButton);


        addButton.addActionListener(new PerformAddNewRow());
        refreshButton.addActionListener(new PerformRefresh(this));
        exitButton.addActionListener(new PerformExit());



        for(int i = 0; i < listOfLabels.length; i++) {
            JLabel newLabel = new JLabel(listOfLabels[i]);
            panelLabels.add(newLabel);
        }

        SQLiteDatabase myDB = new SQLiteDatabase("kiscica");
        try {
            ResultSet result = myDB.selectAll();
            int i = 3;
            while (result.next()) {
                panelLabels.setLayout(new GridLayout(i, 5));

                String title = result.getString("title");
                panelLabels.add(new JLabel(title));

                String username = result.getString("username");
                panelLabels.add(new JLabel(username));

                String password = result.getString("password");
                panelLabels.add(new JLabel(password));

                String url = result.getString("url");
                panelLabels.add(new JLabel(url));

                String note = result.getString("note");
                panelLabels.add(new JLabel(note));
                i += 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        add(panelLabels, BorderLayout.NORTH);


        setVisible(true);
    }
}
