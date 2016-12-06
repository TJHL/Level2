import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Timer clock;
	Box Fodder;
	Box fat;
	BoxManager manager;

	GamePanel(){
		clock = new Timer(1000 / 60,(ActionListener) this);
		Fodder = new Box(Color.RED,20,20,100,100,5,9,true);
		fat= new Box(Color.BLACK,40,40,400,400,5,5,true);
		manager= new BoxManager();
	
		}
			public void paintComponent(Graphics g){
				manager.draw(g);
		
			}
	
			void startGame(){
				clock.start();
		
			}
			
			public void actionPerformed(ActionEvent e) {
				repaint();
				manager.Update();
		
		
			}
} 