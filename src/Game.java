//This is the game itself. When you die it will call the "LoseScreen" java class.
//import the libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Game extends JFrame implements ActionListener, KeyListener {

    final int WIDTH = 20; //Grid width
    final int HEIGHT = 20; //Grid height
    final int PIXEL_WIDTH;
    final int PIXEL_HEIGHT;
    int SNAKE_MOVING_POSITIONX = 3;
    int SNAKE_MOVING_POSITIONY = 6;
    byte[][] grid = new byte[WIDTH][HEIGHT]; //Creates a grid for the snake.
    boolean gameOver = false;

    String startingDirection = "right"; //Directions the snake can move.

    public Game() {
        //start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        // Generates the window.
        this.setSize(800, 800); // Frame size
        PIXEL_WIDTH = this.getWidth() / WIDTH;
        PIXEL_HEIGHT = this.getWidth() / HEIGHT;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //Window cannot be resized
        this.setTitle("Snake!"); //Window title
        this.setVisible(true); //Window background color
        this.setLayout(null);

        while (!gameOver) {
            //Move the snake and go to sleep.
            //gameOver = true;
            grid[SNAKE_MOVING_POSITIONX][SNAKE_MOVING_POSITIONY] = 1; //Snake starting position.
            if (Objects.equals(startingDirection, "right") == true) {
                SNAKE_MOVING_POSITIONX += 1;
            } //if statement
        } //while

        } //game class

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
                }
                g.fillRect(x*PIXEL_WIDTH, y*PIXEL_HEIGHT, PIXEL_WIDTH, PIXEL_HEIGHT);
            }
        }
    }


    //Calls the LoseScreen class when the game is over.
    public void actionPerformed(ActionEvent e) {
        new LoseScreen();
    }

    //Moves the snake.
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}