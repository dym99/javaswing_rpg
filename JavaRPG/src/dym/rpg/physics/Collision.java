package dym.rpg.physics;

import dym.rpg.physics.CollisionMap.CollisionType;

public class Collision {
	public CollisionType cType;
	public int x,y;
	public Collision(CollisionType cType, int x, int y) {
		this.cType = cType;
		this.x = x;
		this.y = y;
	}
}
