//This is the main menu that will pop up when the game is run.
//import the libraries
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    public Menu() {
        this.setSize(800, 800); // Frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Welcome to the game!");
        this.setLayout(null);

        JLabel label = new JLabel("This is a snake game!");
        label.setBounds(300, 100, 200, 30); //Text position and size
        this.add(label);

        JButton PlayButton = new JButton("Play");
        PlayButton.setBounds(300, 200, 200, 50); //Button position and size
        this.add(PlayButton); 
        PlayButton.addActionListener(this);

        JButton HowToPlay = new JButton("How to play");
        HowToPlay.setBounds(300, 300, 200, 50); //Button position and size
        this.add(HowToPlay);
        HowToPlay.addActionListener(this);

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