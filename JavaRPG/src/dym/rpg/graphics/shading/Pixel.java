package dym.rpg.graphics.shading;

import java.awt.Color;
import java.awt.Graphics;

import dym.rpg.Display;
import dym.rpg.Game;
import dym.rpg.physics.Vector2;

public class Pixel {
	public Color c;
	public Vector2 pos;
	public Pixel(Vector2 pos, int r, int g, int b, int a) {
		this.pos = pos;
		c = new Color(r,g,b,a);
	}
	
	public void draw(Graphics g) {
		g.setColor(c);
		if (Display.width==320) {
			g.fillRect((int)Game.d.ScaleCoordinateX(pos.x), (int)Game.d.ScaleCoordinateY(pos.y), (int)Game.d.ScaleCoordinateX(1), (int)Game.d.ScaleCoordinateY(1));
		}else{
			g.fillRect((int)Game.d.ScaleCoordinateX(pos.x)+1, (int)Game.d.ScaleCoordinateY(pos.y)+1, (int)Game.d.ScaleCoordinateX(1)+1, (int)Game.d.ScaleCoordinateY(1)+1);
		}
	}
	
}
