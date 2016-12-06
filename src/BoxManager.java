import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box fat;
	ArrayList<Box> Fodder;
	
	BoxManager(){
		fat= new Box(Color.BLACK,40,40,400,400,5,5,true);
		Fodder = new ArrayList<Box>();
		
	
	}
		void Update(){
			fat.update();
			for (int i = 0; i < Fodder.size(); i++) {
				Box spawn=Fodder.get(i);
				spawn.update();
			}
			manageFodder();
		}
		void draw(Graphics g){
			fat.draw(g);
			for (int i = 0; i < Fodder.size(); i++) {
				Box spawn=Fodder.get(i);
				spawn.draw(g);
			}
		}
		
		void addFodder(Box lil){
			Fodder.add(lil);
			
		}
		void manageFodder(){
			Box spawn= new Box(Color.RED,20,20,100,100,5,9,true);
			addFodder(spawn);
		}
}