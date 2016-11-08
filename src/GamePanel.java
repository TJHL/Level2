import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	public void paintComponent(Graphics g){
		g.fillRect(100, 100, 20, 20);
		g.setColor(Color.BLACK);
	}
}
