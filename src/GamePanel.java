import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
	Timer clock;
	GamePanel(){
	clock = new Timer(1000 / 60,(ActionListener) this);
	}
	public void paintComponent(Graphics g){
		g.fillRect(100, 100, 20, 20);
		g.setColor(Color.BLACK);
	}
	void startGame(){
		clock.start();
		
	}
} 