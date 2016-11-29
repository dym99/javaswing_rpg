package dym.rpg.scene;

import java.awt.Graphics;
import java.util.ArrayList;

import dym.rpg.entities.Entity;
import dym.rpg.physics.CollisionMap;
import dym.rpg.tile.TileMap;

public abstract class Scene {
	public TileMap tileMap;
	public CollisionMap collisionMap;
	public ArrayList<Entity> entities;
	public boolean menuScene;
	public Scene() {
		menuScene = false;
		tileMap = new TileMap();
		collisionMap = new CollisionMap();
		entities = new ArrayList<Entity>();
	}
	public Scene(boolean menuScene) {
		this();
		this.menuScene = menuScene;
	}
	public void update() {
		for (Entity e : entities) {
			e.update();
		}
	}
	public void draw(Graphics g) {
		tileMap.drawTiles(g);
		for (Entity e : entities) {
			e.draw(g);
		}
	}
}
