package net.medox.tutorial;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Pong extends Canvas implements Runnable{
	private static final long serialVersionUID = 1L;

	public JFrame frame;
	
	public String title = "Pong";
	public static int width = 700;
	public static int height = 700;
	
	public boolean running;
	
	public Paddle player1;
	public Paddle player2;
	
	public Pong(){
		frame = new JFrame();
		
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setPreferredSize(new Dimension(width, height));
		
		frame.setTitle(title);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		
		frame.setVisible(true);
		
		start();
	}
	
	public static void main(String args[]){
		new Pong();
	}
	
	public void start(){
		running = true;
		
		player1 = new Paddle(1);
		player2 = new Paddle(2);
		
		new Thread(this).start();
	}
	
	public void run(){
		while(running){
			update();
			render();
		}
	}
	
	public void update(){
		
	}
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		player1.render(g);
		player2.render(g);
		
		g.dispose();
		bs.show();
	}
}
