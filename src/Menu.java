//This is the main menu that will pop up when the game is run.
//import the libraries:
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        //Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome to the game!");
        frame.setLayout(new FlowLayout());

        //Generates the text
        JLabel label = new JLabel("This is a snake game made in java!");
        frame.add(label);
        frame.pack();

        //Generates the buttons.
        JButton PlayButton = new JButton("Play");
        JButton HowToPlay = new JButton("How to play");
        frame.add(PlayButton);
        frame.add(HowToPlay);

        frame.setVisible(true);
    }
}