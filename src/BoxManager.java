import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box fat;
	ArrayList<Box> Fodder;
	BoxManager(Color color, int height, int width,int x,int y, int speedx, int speedy, boolean alive){
		fat= new Box(Color.BLACK,40,40,400,400,5,5,true);
		Fodder = new ArrayList<Box>();
		
	
	}
	void Update(){
	fat.update();
	}
	void draw(Graphics g){
		fat.draw(g);
	}
}
