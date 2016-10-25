package Frames;
import javax.swing.*;

// parent class of all Frames

abstract class Frame extends JFrame {

    public void initializeFrame() {
        setTitle("Password Manager");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
