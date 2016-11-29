package dym.rpg.graphics;

import java.awt.Color;
import java.awt.Graphics;

import dym.rpg.Game;
import dym.rpg.sound.SoundMixer;

public abstract class Sprite {
	Image[] images;
	protected double fps;
	private int framecount=0;
	public int currentimage=0;
	public Sprite(Image[] images) {
		this.images=images;
	}
	public void animate() {
		framecount++;
		if (framecount == 60/fps)
		{
			framecount = 0;
			currentimage++;
			if (currentimage>=images.length) {
				currentimage=0;

			}
		}
	}
	public void resetAnim() {
		currentimage=0;
		framecount=0;
	}
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		images[currentimage].draw(g, x, y, true);
	}
}
