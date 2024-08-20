//This is the main menu that will pop up when the game is run.
//import the libraries
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    public Menu() {
        this.setSize(800, 800); // Frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Welcome to the game!"); //Window title
        this.setLayout(null);

        JLabel label = new JLabel("This is a snake game!"); //Text
        label.setBounds(300, 100, 200, 30); //Text position and size
        this.add(label);

        JButton PlayButton = new JButton("Play"); //Button text
        PlayButton.setBounds(300, 200, 200, 50); //Button position and size
        this.add(PlayButton); 
        PlayButton.addActionListener(this); //Button action

        JButton HowToPlay = new JButton("How to play"); //Button text
        HowToPlay.setBounds(300, 300, 200, 50); //Button position and size
        this.add(HowToPlay); //Add "how to play" button to the window
        HowToPlay.addActionListener(this); //Buttons action

        this.setVisible(true);
    }

    //Calls the Instructions and Game class depending on which button is pressed.
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Play")) {
            new Game();
        }
        else if (e.getActionCommand().equals("How to play")) {
            new Instructions();
        }
    }
} 