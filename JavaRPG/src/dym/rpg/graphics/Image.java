package dym.rpg.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import dym.rpg.Game;

public class Image {
	BufferedImage img;
	public Image(File file) {
		try {
			img = ImageIO.read(file);
			System.out.println("Loaded image: " + file.getPath());
		} catch (IOException e) {
			System.err.println("Failed to load image: " + file.getPath());
		}
	}
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		g.drawImage(img, (int)(Game.d.ScaleCoordinateX(x+0.5-Game.camera.x)), (int)(Game.d.ScaleCoordinateY(y+0.5-Game.camera.y)), (int)(Game.d.ScaleCoordinateX(img.getWidth()+0.5)), (int)(Game.d.ScaleCoordinateY(img.getHeight()+0.5)) ,null);
	}
	public void drawUI(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		g.drawImage(img, (int)(Game.d.ScaleCoordinateX(x+0.5)), (int)(Game.d.ScaleCoordinateY(y+0.5)), (int)(Game.d.ScaleCoordinateX(img.getWidth()+0.5)), (int)(Game.d.ScaleCoordinateY(img.getHeight()+0.5)) ,null);
	}
	public void draw(Graphics g, int x, int y, boolean debug) {
		draw(g,x,y);
		//if (debug) System.err.println(Game.d.ScaleCoordinateX(x+0.5)+", "+Game.d.ScaleCoordinateY(y+0.5));
	}
}
