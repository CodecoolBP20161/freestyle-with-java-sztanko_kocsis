package Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// this class manages escapes

public class PerformExit implements ActionListener {

    public void actionPerformed(ActionEvent actionEvent1) {
        System.exit(0);

    }
}