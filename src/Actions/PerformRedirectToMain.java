package Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerformRedirectToMain extends JDialog implements ActionListener {
    private JDialog dialog;

    public PerformRedirectToMain(JDialog dialog) {
        this.dialog = dialog;
    }

    public void actionPerformed(ActionEvent actionEvent1) {
        this.dialog.dispose();
    }
}