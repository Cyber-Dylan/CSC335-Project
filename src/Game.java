//This is the game itself. When you die it will call the "LoseScreen" java class.
//import the libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Game extends JFrame {
    final int WIDTH = 10; //Grid width
    final int HEIGHT = 10; //Grid height
    JButton[][] buttons = new JButton[WIDTH][HEIGHT]; //Creates a grid for the snake.
    public Game() {

        // Generates the window.
        this.setSize(800, 800); // Frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //Window cannot be resized
        this.setTitle("Snake!"); //Window title
        this.setVisible(true);
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                buttons[j][i] = new JButton(); //Create buttons for the grid.
                buttons[j][i].setBounds(100 + j * 50, 100 + i * 50, 50, 50); //Button position and size
                buttons[j][i].setBackground(Color.WHITE); //Button color
                this.add(buttons[j][i]); //Add buttons to the grid.
            }
        }
        this.setLayout(new GridLayout(HEIGHT, WIDTH));
        buttons[1][3].setBackground(Color.BLACK);
    }
    //Calls the LoseScreen class when the game is over.
    public void actionPerformed(ActionEvent e) {
        new LoseScreen();
    }
}