package dym.rpg.entities;

import java.awt.Graphics;

import dym.rpg.physics.Rect;
import dym.rpg.physics.Vector2;

public abstract class Entity {
	public Vector2 pos;
	public Rect bbox;
	public Entity() {
		pos = new Vector2();
		bbox = new Rect(pos.x, pos.y, 16, 16);
	}
	public Entity(Vector2 pos) {
		this.pos = pos;
		bbox = new Rect(pos.x, pos.y, 16, 16);
	}
	public Entity(Vector2 pos, Rect bbox) {
		this.pos = pos;
		this.bbox = bbox;
	}
	public void click() {
		
	}
	public void update() {
		
	}
	public void draw(Graphics g) {
		
	}
}
