import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class MainFrame extends Frame {
    private String[] listOfLabels = {"Title", "User", "Password", "URL", "Note"};

    public MainFrame() {
        initializeFrame();
        setLoginLayout();

    }

    public void setLoginLayout() {
        JPanel panelLabels = new JPanel();
        panelLabels.setLayout(new GridLayout(1, 5));



        for(int i = 0; i < listOfLabels.length; i++) {
            JLabel newLabel = new JLabel(listOfLabels[i]);
            panelLabels.add(newLabel);
        }

        SQLiteDatabase myDB = new SQLiteDatabase("bok");
        try {
            myDB.createTable();
            myDB.insert("a", "b", "c", "d", "e");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//        JButton buttonSave = new JButton("Save");
//        buttonSave.addActionListener(new PerformLogin(inputDBName, inputPassword, this));
//        panelLabels.add(buttonSave);


        add(panelLabels, BorderLayout.NORTH);

        setVisible(true);
    }
}
