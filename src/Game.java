//This is the game itself. When you die it will call the "LoseScreen" java class.
//import the libraries
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Game extends JFrame {
    public Game() {

        // Generates the window.
        JFrame frame = new JFrame();
        this.setSize(800, 800); // Frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Snake!"); //Window title
        this.setVisible(true);
    }

    //Calls the LoseScreen class when the game is over.
    public void actionPerformed(ActionEvent e) {
        new LoseScreen();
    }
}