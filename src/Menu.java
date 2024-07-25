//This is the main menu that will pop up when the game is run.
//import the libraries:
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    public Menu() {
        //Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome to the game!");

        //Generates the text
        JLabel label = new JLabel("This is a snake game made in java!");
        frame.add(label);
        frame.pack();

        //Generates the buttons.
        JButton PlayButton = new JButton("Play");
        frame.add(PlayButton);
        PlayButton.addActionListener(this);

        JButton HowToPlay = new JButton("How to play");
        frame.add(HowToPlay);
        HowToPlay.addActionListener(this);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        new Instructions();
    }
}
