package net.medox.tutorial;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle{
	public int paddleNumber;
	
	public int x;
	public int y;
	public int width = 50;
	public int height = 250;
	
	public int score;
	
	public Paddle(int paddleNumber){
		this.paddleNumber = paddleNumber;
		
		if(paddleNumber == 1){
			x = 0;
		}
		
		if(paddleNumber == 2){
			x = Pong.width - width;
		}
		
		y = Pong.height / 2 - height / 2;
	}
	
	public void render(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
}
