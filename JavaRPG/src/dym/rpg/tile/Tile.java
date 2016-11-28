package dym.rpg.tile;

import java.awt.Color;
import java.awt.Graphics;

import dym.rpg.entities.Entity;
import dym.rpg.graphics.Image;
import dym.rpg.physics.Vector2;

public class Tile extends Entity {
	private Image image;
	public Tile(Vector2 pos, Image image) {
		super(pos);
		this.image = image;
	}
	@Override
	public void update() {}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		image.draw(g, (int)pos.x, (int)pos.y);
	}
}
