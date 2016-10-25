package Frames;

import javax.swing.*;
import java.awt.*;

public class AddNewRowDialog {
    private String[] listOfLabels = {"Title", "User", "Password", "URL", "Note"};

    public AddNewRowDialog() {
        JDialog dialog = initialize();
        fillWithContent(dialog);

//        dialog.getContentPane().add(new JLabel("hi there"));
        dialog.setSize(400, 400);
        dialog.setResizable(false);
        dialog.setVisible(true);
        dialog.pack();
    }

    public JDialog initialize() {
        JDialog dialog = new JDialog();
        dialog.setEnabled(true);
        dialog.setModal(true);
        return dialog;
    }

    public void fillWithContent(JDialog dialog) {
        JPanel panelLabels = new JPanel();
        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");
        panelLabels.add(saveButton);
        panelLabels.add(cancelButton);
        panelLabels.setLayout(new GridLayout(1, 1));
        int counter = 2;
        for (int i = 0; i < this.listOfLabels.length; i++) {
            panelLabels.setLayout(new GridLayout(counter, 1));
            JTextField field = new JTextField(listOfLabels[i]);
            panelLabels.add(field);
            counter += 1;
        }
        panelLabels.setLayout(new GridLayout(counter, 1));
        panelLabels.add(cancelButton);
        dialog.add(panelLabels);
    }
}
