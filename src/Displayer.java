import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class Displayer extends JFrame {

    public Displayer() {

        setTitle("Password Manager");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel text = new JLabel("Username:");
        panel1.add(text);
        add(panel1, BorderLayout.WEST);

        JButton button = new JButton("Press me");
        panel2.add(button);
        add(panel2, BorderLayout.EAST);
        setVisible(true);


    }
}
