package Frames;

import Database.SQLiteDatabase;
import Actions.PerformAddNewRow;
import Database.StorageState;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainFrame extends Frame {
    private String[] listOfLabels = {"Title", "User", "Password", "URL", "Note"};
    private String dbName;

    public MainFrame(String dbName) {
        this.dbName = dbName;
        initializeFrame();
        setLoginLayout();

    }

    public void setLoginLayout() {
        JPanel panelLabels = new JPanel();

        panelLabels.setLayout(new GridLayout(1, 1));
        JButton addButton = new JButton("Add");
        panelLabels.add(addButton);
        addButton.addActionListener(new PerformAddNewRow());
        panelLabels.setLayout(new GridLayout(2, 5));



        for(int i = 0; i < listOfLabels.length; i++) {
            JLabel newLabel = new JLabel(listOfLabels[i]);
            panelLabels.add(newLabel);
        }

            StorageState myDB = new StorageState();
            myDB.setDatabaseToSQLite(this.dbName);


            ResultSet result = myDB.selectAll();
            int i = 3;
        try {
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
        }


        add(panelLabels, BorderLayout.NORTH);

        setVisible(true);
    }
}
