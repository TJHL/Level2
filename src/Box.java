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
		g.setColor(color);
		g.fillRect(x, y, height, width);
		
	}
	void update(){
		x=x+speedx;
		y=y+speedy;
		if(x>=Box_Collision.WIDTH-width){
			speedx=-speedx;
		}
		if(x<=0){
			speedx=-speedx;
		}
		if(y>=Box_Collision.HEIGHT-height){
			speedy=-speedy;
		}
		if(y<=0){
			speedy=-speedy;
		}
		if(x+width >= Box_Collision.WIDTH){
			x=Box_Collision.WIDTH-width;
		}
		if(y+height >= Box_Collision.HEIGHT){
			y=Box_Collision.HEIGHT-height;
		}
	}
}