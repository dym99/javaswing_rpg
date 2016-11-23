package dym.rpg.maps;

import dym.rpg.physics.Collision;
import dym.rpg.physics.CollisionMap;

public class TestMap extends CollisionMap {
	public TestMap() {
		super();
		collisions.add(new Collision(CollisionType.SOLID, 0, 0));
		collisions.add(new Collision(CollisionType.SOLID, 16, 0));
		collisions.add(new Collision(CollisionType.SOLID, 32, 0));
		collisions.add(new Collision(CollisionType.SOLID, 48, 0));
		collisions.add(new Collision(CollisionType.SOLID, 64, 0));
		collisions.add(new Collision(CollisionType.SOLID, 80, 0));
		collisions.add(new Collision(CollisionType.SOLID, 96, 0));
		collisions.add(new Collision(CollisionType.SOLID, 112, 0));
		collisions.add(new Collision(CollisionType.SOLID, 0, 16));
		collisions.add(new Collision(CollisionType.SOLID, 0, 32));
		collisions.add(new Collision(CollisionType.SOLID, 0, 48));
		collisions.add(new Collision(CollisionType.SOLID, 0, 64));
		collisions.add(new Collision(CollisionType.SOLID, 0, 80));
		collisions.add(new Collision(CollisionType.SOLID, 0, 96));
		collisions.add(new Collision(CollisionType.SOLID, 0, 112));
		collisions.add(new Collision(CollisionType.SOLID, 16, 112));
		collisions.add(new Collision(CollisionType.SOLID, 32, 112));
		collisions.add(new Collision(CollisionType.SOLID, 48, 112));
		collisions.add(new Collision(CollisionType.SOLID, 64, 112));
		collisions.add(new Collision(CollisionType.SOLID, 80, 112));
		collisions.add(new Collision(CollisionType.SOLID, 96, 112));
		collisions.add(new Collision(CollisionType.SOLID, 112, 112));
		collisions.add(new Collision(CollisionType.SOLID, 112, 16));
		collisions.add(new Collision(CollisionType.SOLID, 112, 32));
		collisions.add(new Collision(CollisionType.SOLID, 112, 48));
		collisions.add(new Collision(CollisionType.SOLID, 112, 64));
		collisions.add(new Collision(CollisionType.SOLID, 112, 80));
		collisions.add(new Collision(CollisionType.SOLID, 112, 96));
	}
}
