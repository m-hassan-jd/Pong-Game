package PongGame;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    GamePanel panel;
	ImageIcon image;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		image = new ImageIcon("pong.png");
		this.setIconImage(image.getImage());
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
