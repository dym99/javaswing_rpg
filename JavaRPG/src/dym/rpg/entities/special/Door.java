package dym.rpg.entities.special;

import dym.rpg.entities.Entity;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.Scene;

public class Door extends Entity{
	public boolean globaldoor = false;
	public Vector2 dest;
	public Scene destScene;
	public Door(int x, int y, int x2, int y2) {
		pos.x = x;
		pos.y = y;
		dest = new Vector2(x2,y2);
	}
	public Door(int x, int y, int x2, int y2, Scene destination) {
		pos.x = x;
		pos.y = y;
		dest = new Vector2(x2,y2);
		globaldoor = true;
		destScene=destination;
	}
}
