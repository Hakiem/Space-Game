package com.game.src.main;

import java.awt.Graphics;

public class Bullet implements Entity {

	private double x;
	private double y;
	
	private Textures tex;
	
	public Bullet(double x, double y, Textures tex){
		this.x = x;
		this.y = y;
		
		this.tex = tex;
	}
	
	public void tick(){
		y -= 10;
	}
	
	public void render(Graphics g){
		g.drawImage(tex.missile, (int)x, (int)y ,null);
	}
	
	public double getY() {
		return y;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return 0;
	}
}
