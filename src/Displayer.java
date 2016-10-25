import javax.swing.*;
import java.awt.*;

public class Displayer extends JFrame {

    public Displayer() {

        setTitle("Password Manager");
        setSize(400, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panelLabels = new JPanel();
        panelLabels.setLayout(new GridLayout(4, 2));

        JLabel textUserName = new JLabel("Username:");
        panelLabels.add(textUserName);

        panelLabels.add(new JTextField(), BorderLayout.EAST);

        JLabel textPassword = new JLabel("Password:");
        panelLabels.add(textPassword);

        panelLabels.add(new JTextField(), BorderLayout.EAST);

        JLabel textDBUserName = new JLabel("Database username:");
        panelLabels.add(textDBUserName);

        panelLabels.add(new JTextField(), BorderLayout.EAST);

        JLabel textDBName = new JLabel("Database name:");
        panelLabels.add(textDBName);

        panelLabels.add(new JTextField(), BorderLayout.EAST);

//        panelLabels.setLayout(new FlowLayout(1, 10, 0));
        add(panelLabels);

//        JButton button = new JButton();
//        panelLabels.add(button);

//        JPanel northOnlyPanel = new JPanel();
//        northOnlyPanel.setLayout(new BorderLayout());
//        northOnlyPanel.add(panelLabels);
//        add(northOnlyPanel);
//
//        JScrollPane scroll = new JScrollPane(northOnlyPanel,
//                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//
//        add(scroll, BorderLayout.CENTER);

//        JTextArea help = new JTextArea();
//        help.setLineWrap(true);
//        help.setWrapStyleWord(true);
//        help.setEditable(false);
//
//        JPanel split = new JPanel();
//        split.setLayout(new GridLayout(1, 2));
//        split.add(scroll);
//        split.add(help);

        setVisible(true);





    }
}
