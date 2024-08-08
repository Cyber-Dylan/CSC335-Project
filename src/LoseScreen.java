//This is the screen that will pop up when you lose.
//import the libraries:
import java.awt.event.*;
import javax.swing.*;

public class LoseScreen extends JFrame implements ActionListener {
    public LoseScreen() {
        //Generates the window.
        this.setSize(800, 800); // Frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("You Lose!");
        this.setLayout(null);

        //Generates the buttons.
        JButton PlayAgain = new JButton("Play Again");
        this.add(PlayAgain);
        PlayAgain.setBounds(300, 200, 200, 50);
        PlayAgain.addActionListener(this);
    }

    //Calls the game class when the button is pressed.
    public void actionPerformed(ActionEvent e){
        new Game();
    }
}