//This is the screen that will pop up when you lose.
//import the libraries:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WinScreen extends JFrame {
    public static void main(String[] args) {
        //Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("You win!");
        frame.setLayout(new FlowLayout());
    }
}