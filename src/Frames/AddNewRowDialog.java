package Frames;

import Actions.PerformRedirectToMain;
import Actions.PerformSaveNewRow;

import javax.swing.*;
import java.awt.*;

// this class is responsible for building dialog window, child of Frame class

public class AddNewRowDialog extends Dialog {
    private String[] listOfLabels = {"Title", "User", "Password", "URL", "Note"};
    String dbName;

    public AddNewRowDialog(String dbname) {
        this.dbName = dbname;
        JDialog dialog = initialize();
        fillWithContent(dialog);
        dialog.setSize(400, 400);
        dialog.setResizable(false);
        dialog.setVisible(true);
        dialog.pack();
    }


    public void fillWithContent(JDialog dialog) {
        JPanel panelLabels = new JPanel();
        panelLabels.setLayout(new GridLayout(7, 1));

        JButton saveButton = new JButton("Save");
        panelLabels.add(saveButton);

        JTextField title = new JTextField("Title...");
        panelLabels.add(title);

        JTextField user = new JTextField("User...");
        panelLabels.add(user);

        JTextField password = new JTextField("Password...");
        panelLabels.add(password);

        JTextField url = new JTextField("URL...");
        panelLabels.add(url);

        JTextField note = new JTextField("Note...");
        panelLabels.add(note);

        JButton cancelButton = new JButton("Cancel");
        panelLabels.add(cancelButton);

        cancelButton.addActionListener(new PerformRedirectToMain(dialog));
        saveButton.addActionListener(new PerformSaveNewRow(this.dbName,dialog, title, user, password, url, note));

        dialog.add(panelLabels);
    }
}
