package dym.rpg.graphics.shading;

import dym.rpg.Game;
import dym.rpg.physics.Vector2;

public class Light {
	private Vector2 pos;
	private float strength;
	public Light(Vector2 pos, float strength) {
		this.pos = pos;
		this.strength = strength;
	}
	public int getStrengthAtPoint(Vector2 point) {
		Vector2 pos2 = pos;//.sub(Game.camera);
		double px = pos2.x;
		double py = pos2.y;
		int r = (int)Math.sqrt(Math.pow(px-point.x-Game.camera.x+8,2)+Math.pow(py-point.y-Game.camera.y+8,2));
		int a = (int)(255*(strength*strength+1)/(r*r+1));
		if (a>255) {
			a=255;
		}
		return a;
	}
}
