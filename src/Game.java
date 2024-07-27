//This is the file where the game is.
//import the libraries
import javax.swing.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
//import java.util.Scanner;

public class Game {
    public Game() {
        //Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake!");
    }
    public void actionPerformed(ActionEvent e){
        new LoseScreen();
    }
}