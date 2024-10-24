//This is the game itself. When you die it will call the "LoseScreen" java class.
//import the libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.io.*;
import java.lang.Thread;
import java.util.stream.LongStream;
import javax.swing.Timer;

public class Game extends JFrame implements KeyListener {

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

                int CheckX = SNAKE_MOVING_POSITIONX;
                int CheckY = SNAKE_MOVING_POSITIONY;

                //Switch (current direction)
                switch (currentDirection) {
                    case DIRECTION_LEFT:
                        CheckX -= 1;
                        break;
                    case DIRECTION_RIGHT:
                        CheckX += 1;
                        break;
                    case DIRECTION_UP:
                        CheckY -= 1;
                        break;
                    case DIRECTION_DOWN:
                        CheckY += 1;
                        break;
                }

                if (!gameOver) {
                    repaint();
                } else {
                    timer.stop();
                    new LoseScreen();
                }


                //Change this to use CheckX, CheckY
                if (grid[CheckX][CheckY] == 1) {
                    System.out.println("Snake is on top of self");
                    gameOver = true;
                }

                //Swap this around
                if (CheckX < 20 && CheckY > 0 && CheckX > 0 && CheckY < 20) {
                    System.out.println("Snake is in board");
                    SNAKE_MOVING_POSITIONX = CheckX;
                    SNAKE_MOVING_POSITIONY = CheckY;
                    grid[SNAKE_MOVING_POSITIONX][SNAKE_MOVING_POSITIONY] = 1; //Snake starting position.
                }
                else {
                    System.out.println("Snake is out of bounds");
                    gameOver = true;
                }

                System.out.println (SNAKE_MOVING_POSITIONX +","+ SNAKE_MOVING_POSITIONY);
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