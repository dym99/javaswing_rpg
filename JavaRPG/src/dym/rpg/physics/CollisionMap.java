package dym.rpg.physics;

import java.util.ArrayList;

public class CollisionMap {
	public ArrayList<Collision> collisions;
	public CollisionMap() {
		collisions = new ArrayList<Collision>();
	}
	public CollisionType getCollsionAt(int x, int y) {
		//Returns Collision at position (x,y)
		CollisionType result = CollisionType.NONE;
		for (Collision c : collisions) {
			if (c.x == x&&c.y==y) {
				result = c.cType;
				break;
			}
		}
		return result;
	}
	public enum CollisionType {
		NONE,
		GROUND,
		SOLID,
		WATER
	}
}
