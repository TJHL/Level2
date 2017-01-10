import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class BoxManager {
	Box fat;
	ArrayList<Box> Fodder;
	int fodderTimer;
	int fodderSpawnTimer=20;
	
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
			checkFodder();
			killFodder();
			
		}
		void draw(Graphics g){
			for (int i = 0; i < Fodder.size(); i++) {
				Box spawn=Fodder.get(i);
				spawn.draw(g);
			}
			fat.draw(g);
		}
		
		
		void addFodder(Box lil){
			Fodder.add(lil);
			
		}
		void manageFodder(){
			fodderTimer+=1;
			if(fodderTimer>= fodderSpawnTimer){
			fodderTimer=0;
			Box spawn= new Box(Color.RED,20,20,(int)(Math.random()*Box_Collision.WIDTH),(int)(Math.random()*Box_Collision.HEIGHT),5,9,true);
			addFodder(spawn);
			}
	
		}
		void checkFodder(){
			for (int i = 0; i < Fodder.size(); i++) {
				checkEat(fat, Fodder.get(i));
			}
		}
		void checkEat(Box A, Box B){
			if((A.x<=B.x)&&(A.x+A.width >= B.x+B.width)&&(A.y<=B.y)&&(A.y+A.height>=B.y+B.height)){
				B.alive=false;
			}
		}
		void killFodder(){
			for (int i = 0; i < Fodder.size(); i++) {
				if(Fodder.get(i).isalive()== false){
					Fodder.remove(i);
					Grow();
				}
			}
		}
		void Grow(){
			fat.width=fat.width+1;
			fat.height=fat.height+1;
		}
}