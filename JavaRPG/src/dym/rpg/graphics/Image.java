package dym.rpg.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {
	BufferedImage img;
	public Image(File file) {
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			System.err.println("Failed to load image: " + file.getPath());
		}
	}
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		g.drawImage(img, x, y, null);
	}
}
