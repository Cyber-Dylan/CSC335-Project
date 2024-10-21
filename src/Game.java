//This is the game itself. When you die it will call the "LoseScreen" java class.
//import the libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.io.*;
import java.lang.Thread;
import javax.swing.Timer;

public class Game extends JFrame implements ActionListener, KeyListener {

Timer timer;

    final int WIDTH = 20; //Grid width
    final int HEIGHT = 20; //Grid height
    final int PIXEL_WIDTH;
    final int PIXEL_HEIGHT;
    int SNAKE_MOVING_POSITIONX = 9;
    int SNAKE_MOVING_POSITIONY = 9;
    byte[][] grid = new byte[WIDTH][HEIGHT]; //Creates a grid for the snake.
    boolean gameOver = false;

    //Directions the snake can move.
    final String DIRECTION_LEFT = "left";
    final String DIRECTION_RIGHT = "right";
    final String DIRECTION_UP = "up";
    final String DIRECTION_DOWN = "down";
    String currentDirection = DIRECTION_RIGHT;

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



        timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                grid[SNAKE_MOVING_POSITIONX][SNAKE_MOVING_POSITIONY] = 1;//Snake starting position.

                //Movement logic.
                switch (currentDirection) {
                    case DIRECTION_RIGHT -> SNAKE_MOVING_POSITIONX += 1;
                    case DIRECTION_LEFT -> SNAKE_MOVING_POSITIONX += -1;
                    case DIRECTION_UP -> SNAKE_MOVING_POSITIONY += -1;
                    case DIRECTION_DOWN -> SNAKE_MOVING_POSITIONY += 1;
                }

                System.out.println (SNAKE_MOVING_POSITIONX +","+ SNAKE_MOVING_POSITIONY);
                if (SNAKE_MOVING_POSITIONX > 19 || SNAKE_MOVING_POSITIONY < 0 || SNAKE_MOVING_POSITIONY > 10) {
                    gameOver = true;
                }
                if (gameOver == true) {
                    new LoseScreen();
                }
                repaint();
            }
        });
            timer.start();
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
        char keyChar = keyEvent.getKeyChar();
        switch (keyChar) {
            case 'w':
                currentDirection = DIRECTION_UP;
                break;
            case 'a':
                currentDirection = DIRECTION_LEFT;
                break;
            case 's':
                currentDirection = DIRECTION_DOWN;
                break;
            case 'd':
                currentDirection = DIRECTION_RIGHT;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }
}