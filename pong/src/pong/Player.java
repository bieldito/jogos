package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	
	public boolean right,left;
	
	public int x,y;
	
	public int width,height;
	
	public Ball ball;
	
	public Player(int x, int y, Ball ball) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
		this.ball = ball;		
	}
	
	public void tick(){
		if( (right || left) && ball.speed==0) {
			ball.speed = ball.speedInicio;			
		}
				
		if(right)
		{
			x=x+4;			
		}
		else if(left) {
			x=x-4;
		}
		
		if(x+width > Game.WIDTH)
		{
			x = Game.WIDTH - width;
		}
		
		else if(x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(x,y,width,height);
	}
	
}
