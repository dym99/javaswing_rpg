package dym.rpg.graphics.shading;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import dym.rpg.physics.Vector2;
import dym.rpg.scene.SceneManager;

public class LightingHandler {
	private static ArrayList<Pixel> pixels = new ArrayList<Pixel>();
	private static Color tint;
	public static void init() {
		tint = new Color(0,0,0,127);
		for (int y=0;y<240;y++) {
			for (int x=0;x<320;x++) {
				pixels.add(new Pixel(new Vector2(x,y),0,0,0,127));
			}
		}
	}
	public static void update() {
		for (Pixel p : pixels) {
			int a=230;
			for (Light l : SceneManager.currentScene.lights) {
				a-=l.getStrengthAtPoint(p.pos);
			}
			if (a<0)a=0;
			if (a>255) a=255;
			p.c = new Color(tint.getRed(),tint.getGreen(),tint.getBlue(),a);
		}
	}
	public static void setTint(Color tint) {
		
	}
	public static void draw(Graphics g) {
		for (Pixel p : pixels) {
			p.draw(g);
		}
	}
}
