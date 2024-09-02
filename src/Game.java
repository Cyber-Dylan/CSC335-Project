//This is the game itself. When you die it will call the "LoseScreen" java class.
//import the libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Game extends JFrame {
    final int WIDTH = 20; //Grid width
    final int HEIGHT = 20; //Grid height
    final int PIXEL_WIDTH;
    final int PIXEL_HEIGHT;
    byte[][] grid = new byte[WIDTH][HEIGHT]; //Creates a grid for the snake.
    public Game() {
        grid[4][6]=1; //Snake starting position.
        grid[5][2]=2; //Apple starting position.
        // Generates the window.
        this.setSize(800, 800); // Frame size
        PIXEL_WIDTH = this.getWidth()/WIDTH;
        PIXEL_HEIGHT = this.getWidth()/HEIGHT;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //Window cannot be resized
        this.setTitle("Snake!"); //Window title
        this.setVisible(true); //Window background color
    }

    public void paint(Graphics g) {
        //Generates the grid.
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                switch (grid[x][y]) {
                    case 0:
                        g.setColor(Color.BLACK); //Background colour
                        break;
                    case 1:
                        g.setColor(Color.GREEN); //snake colour
                        break;
                    case 2:
                        g.setColor(Color.RED); //Apple Colour
                        break;
                }
                g.fillRect(x*PIXEL_WIDTH, y*PIXEL_HEIGHT, PIXEL_WIDTH, PIXEL_HEIGHT);
            }
        }
    }

    //Calls the LoseScreen class when the game is over.
    public void actionPerformed(ActionEvent e) {
        new LoseScreen();
    }
}