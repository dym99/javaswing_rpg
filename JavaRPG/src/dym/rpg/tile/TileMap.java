package dym.rpg.tile;

import java.awt.Graphics;
import java.util.ArrayList;

import dym.rpg.Game;
import dym.rpg.physics.Rect;

public class TileMap {
	public ArrayList<Tile> backTiles;
	public ArrayList<Tile> mainTiles;
	public ArrayList<Tile> decalTiles;
	public Rect camera;
	public TileMap() {
		backTiles = new ArrayList<Tile>();
		mainTiles = new ArrayList<Tile>();
		decalTiles = new ArrayList<Tile>();
		camera = new Rect(0,0,320,240);
	}
	public void drawTiles(Graphics g) {
		camera.x=Game.camera.x;
		camera.y=Game.camera.y;
		for (Tile t : backTiles) {
			if (t.pos.x<camera.getRight().x&&t.pos.x>camera.getLeft().x-16&&t.pos.y<camera.getBottom().y&&t.pos.y>camera.getTop().y-16) {
				t.draw(g);
			}
		}
		for (Tile t : mainTiles) {
			if (t.pos.x<camera.getRight().x&&t.pos.x>camera.getLeft().x-16&&t.pos.y<camera.getBottom().y&&t.pos.y>camera.getTop().y-16) {
				t.draw(g);
			}
		}
		for (Tile t : decalTiles) {
			if (t.pos.x<camera.getRight().x&&t.pos.x>camera.getLeft().x-16&&t.pos.y<camera.getBottom().y&&t.pos.y>camera.getTop().y-16) {
				t.draw(g);
			}
		}
	}
}
