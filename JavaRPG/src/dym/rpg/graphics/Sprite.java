package dym.rpg.graphics;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Sprite {
	Image[] images;
	public int currentimage=0;
	public Sprite(Image[] images) {
		this.images=images;
	}
	public void animate() {
		currentimage++;
		if (currentimage>images.length) {
			currentimage=0;
		}
	}
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		images[currentimage].draw(g, x, y);
	}
}
