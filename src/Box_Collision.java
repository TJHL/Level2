import javax.swing.JFrame;

public class Box_Collision  {
	
	JFrame frame;
	GamePanel panel;
	static final int WIDTH = 800;
	static final int HEIGHT = 800;
	
	public static void main(String[] args) {
	
	Box_Collision a =new Box_Collision();
	
	}
		Box_Collision(){
		
			frame= new JFrame();
			panel=new GamePanel();
			setup();
	
		}
	
		void setup(){
			frame.add(panel);
			frame.setSize(WIDTH, HEIGHT);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panel.startGame();
		}	
}