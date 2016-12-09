package dym.rpg.scene;

import java.util.ArrayList;

import dym.rpg.entities.Entity;
import dym.rpg.graphics.shading.Light;
import dym.rpg.physics.CollisionMap;
import dym.rpg.tile.TileMap;

public abstract class Scene {
	public TileMap tileMap;
	public CollisionMap collisionMap;
	public ArrayList<Entity> entities;
	public ArrayList<Light> lights;
	public boolean menuScene=false;
	public int lighting=TIME_BASED;
	
	public static final int TIME_BASED=0,DARK=1,LIGHT=2;
	public Scene() {
		menuScene = false;
		tileMap = new TileMap();
		collisionMap = new CollisionMap();
		entities = new ArrayList<Entity>();
		lights = new ArrayList<Light>();
	}
	public Scene(boolean menuScene) {
		this();
		this.menuScene = menuScene;
	}
	public Scene(boolean menuScene, int lighting) {
		this();
		this.menuScene = menuScene;
		this.lighting = lighting;
	}
}
