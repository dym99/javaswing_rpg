package dym.rpg.entities;

import dym.rpg.physics.Vector2;

public abstract class Entity {
	public Vector2 pos;
	public Entity() {
		pos = new Vector2();
	}
	public Entity(Vector2 pos) {
		this.pos = pos;
	}
}
