import java.awt.Color;
import java.awt.Graphics;

public class Box {
	boolean empty;
	Color color;
	int height;
	int width;
	int x;
	int y;
	int speedx;
	int speedy;
	boolean alive;
	Box(Color color, int height, int width,int x,int y, int speedx, int speedy, boolean alive){
		this.color = color;
		this.height=height;
		this.width=width;
		this.x=x;
		this.y=y;
		this.speedx=speedx;
		this.speedy=speedy;
		this.alive=alive;
	}
	boolean isalive(){
		return alive;
	
	}
	void draw(Graphics g){
		g.setColor(Color.RED);
		//g.fillRect(x, y, width, height);
		g.fillRect(100, 100, 20, 20);
		
	}
	void update(){
	
	}
}