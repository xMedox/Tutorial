package net.medox.tutorial;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Pong extends Canvas{
	private static final long serialVersionUID = 1L;

	public JFrame frame;
	
	public String title = "Pong";
	public int width = 854;
	public int height = 480;
	
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
	}
	
	public static void main(String args[]){
		new Pong();
	}
}
