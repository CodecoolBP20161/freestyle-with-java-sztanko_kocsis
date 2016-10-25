package Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerformSaveNewRow extends JDialog implements ActionListener {
    private JDialog dialog;
    private JTextField title;
    private JTextField user;
    private JTextField password;
    private JTextField url;
    private JTextField note;

    public PerformSaveNewRow(JDialog dialog, JTextField title, JTextField user, JTextField password, JTextField url, JTextField note) {
        this.dialog = dialog;
        this.title = title;
        this.user = user;
        this.password = password;
        this.url = url;
        this.note = note;
    }

    public void actionPerformed(ActionEvent actionEvent1) {
        String title = this.title.getText();
        String user = this.user.getText();
        String password = this.password.getText();
        String url = this.url.getText();
        String note = this.note.getText();
        HandleButton buttonHandler = new HandleButton();
        buttonHandler.saveData(title, user, password, url, note);

        this.dialog.dispose();
    }
}