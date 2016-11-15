import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Timer clock;
	GamePanel(){
		
	clock = new Timer(1000 / 60,(ActionListener) this);
	
	}
	public void paintComponent(Graphics g){
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Box_Collision.WIDTH, Box_Collision.HEIGHT);
		
	}
	
	void startGame(){
		clock.start();
		
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
} 