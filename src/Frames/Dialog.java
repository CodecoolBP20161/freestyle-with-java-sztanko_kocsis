package Frames;

import javax.swing.*;


public class Dialog {

    public JDialog initialize() {
        JDialog dialog = new JDialog();
        dialog.setEnabled(true);
        dialog.setModal(true);
        return dialog;
    }
}


