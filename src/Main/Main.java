package Main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Creating the window
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        // Adding the game panel
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        // makes the window be sized to fit the preferred size and layouts of its subcomponents
        window.pack();

        window.setLocationRelativeTo(null); // opens window at centre of screen
        window.setVisible(true);
    }
}
