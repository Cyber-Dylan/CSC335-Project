//This is the screen that will pop up when you lose.
//import the libraries:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoseScreen extends JFrame implements ActionListener {
    public LoseScreen() {
        //Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("You Lose!");

        //Generates the buttons.
        JButton PlayAgain = new JButton("Play Again");
        frame.add(PlayAgain);
        PlayAgain.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        new Game();
    }
}