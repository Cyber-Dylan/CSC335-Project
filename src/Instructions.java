//This is the main menu that will pop up when the game is run.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Instructions {
    public static void main(String[] args) {
        //Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("How to play");
        frame.setLayout(new FlowLayout());

        //Generates the buttons.
        JButton backbutton = new JButton("Back");
        frame.add(backbutton);

        frame.setVisible(true);
    }
}