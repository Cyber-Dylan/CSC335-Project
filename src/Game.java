//This is the game itself. When you die it will call the "LoseScreen" java class.
//import the libraries
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Game {
    public Game() {

        // Generates the window.
        JFrame frame = new JFrame();
        frame.setSize(800, 800); // Frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake!"); //Frame title
        frame.setVisible(true);

    }

    //Calls the LoseScreen class when the game is over.
    public void actionPerformed(ActionEvent e) {
        new LoseScreen();
    }
}