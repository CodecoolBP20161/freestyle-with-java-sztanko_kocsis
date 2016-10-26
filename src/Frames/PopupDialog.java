package Frames;

import javax.swing.*;
import java.awt.*;

// this class responsible for popup alerts

public class PopupDialog extends Dialog{
    String message;

    public PopupDialog(String message) {
        this.message = message;
        JDialog dialog = initialize();
        fillWithContent(dialog);
        dialog.setSize(200, 200);
        dialog.setResizable(false);
        dialog.setVisible(true);
        dialog.pack();
    }

    public void fillWithContent(JDialog dialog) {
        JPanel panelLabels = new JPanel();

        JLabel message = new JLabel(this.message);
        panelLabels.setLayout(new FlowLayout(1,100,100));
        panelLabels.add(message);

        dialog.add(panelLabels);
    }
}
