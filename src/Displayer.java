//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
//public class Displayer extends JFrame {
//
//    public Displayer() {
//
//        setTitle("Password Manager");
//        setSize(400, 300);
//        setResizable(false);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        JPanel panelLabels = new JPanel();
//        panelLabels.setLayout(new GridLayout(3, 2));
//
//        JLabel textDBName = new JLabel("Database name:");
//        panelLabels.add(textDBName);
//
//        JTextField inputDBName = new JTextField();
//        panelLabels.add(inputDBName, BorderLayout.EAST);
//
//
//        JLabel textPassword = new JLabel("Password:");
//        panelLabels.add(textPassword);
//
//        JTextField inputPassword = new JTextField();
//        panelLabels.add(inputPassword, BorderLayout.EAST);
//
//        JButton buttonCancel = new JButton("Cancel");
////        buttonCancel.addActionListener(new EventHandler());
//        panelLabels.add(buttonCancel);
//
//
//        JButton buttonSave = new JButton("Save");
//        buttonSave.addActionListener(new EventHandler(inputPassword));
//        buttonSave.addActionListener(new EventHandler(inputDBName));
//        buttonCancel.addActionListener(new Actions.PerformExit());
//
//        panelLabels.add(buttonSave);
//
//
//
//
////        panelLabels.setLayout(new FlowLayout(1, 10, 0));
//        add(panelLabels);
//
//
////        JButton button = new JButton();
////        panelLabels.add(button);
//
////        JPanel northOnlyPanel = new JPanel();
////        northOnlyPanel.setLayout(new BorderLayout());
////        northOnlyPanel.add(panelLabels);
////        add(northOnlyPanel);
////
////        JScrollPane scroll = new JScrollPane(northOnlyPanel,
////                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
////                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
////
////        add(scroll, BorderLayout.CENTER);
//
////        JTextArea help = new JTextArea();
////        help.setLineWrap(true);
////        help.setWrapStyleWord(true);
////        help.setEditable(false);
////
////        JPanel split = new JPanel();
////        split.setLayout(new GridLayout(1, 2));
////        split.add(scroll);
////        split.add(help);
//
//        setVisible(true);
//
//
//
//
//
//    }
//}
