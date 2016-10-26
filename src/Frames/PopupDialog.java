package Frames;

import javax.swing.*;
import java.awt.*;

// this class responsible for popup alerts

public class PopupDialog extends Dialog{
    String message;
    int width;
    int height;

    public PopupDialog(String message,int width, int height) {
        this.message = message;
        this.width = width;
        this.height = height;
        JDialog dialog = initialize();
        fillWithContent(dialog);
        dialog.setSize(this.height, this.width);
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
