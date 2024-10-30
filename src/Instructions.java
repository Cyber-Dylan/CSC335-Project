//This is the main menu that will pop up when the game is run.
//import the libraries
import java.awt.event.*;
import javax.swing.*;

public class Instructions extends JFrame implements ActionListener {
    public Instructions() {
        //Generates the window.
        this.setSize(800, 800); // Frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("How to play"); //Window title
        this.setLayout(null);

        //Generates the text
        JLabel label = new JLabel("Guide the snake using the W A S D keys, try not to crash! " +
                "(Mashing the keys will make the snake crash.)"); //Text
        label.setBounds(100, 100, 600, 30); //Text position and size
        this.add(label);

        //Generates the buttons.
        JButton BackButton = new JButton("Back"); //Button text
        this.add(BackButton);
        BackButton.setBounds(300, 300, 200, 50); //Button position and size
        BackButton.addActionListener(this); //Button action

        this.setVisible(true);
    }

    //Calls the menu class when the button is pressed.
    public void actionPerformed(ActionEvent e){
        new Menu();
    }
}