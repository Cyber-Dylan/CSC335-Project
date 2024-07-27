//This is the main menu that will pop up when the game is run.
//import the libraries
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Instructions extends JFrame implements ActionListener {
    public Instructions() {
        //Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("How to play");

        //Generates the text
        JLabel label = new JLabel("Guide the snake using the arrow keys, " + "eat food to grow longer but try not to crash!");
        frame.add(label);
        frame.pack();

        //Generates the buttons.
        JButton BackButton = new JButton("Back");
        frame.add(BackButton);
        BackButton.addActionListener(this);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        new Menu();
    }
}