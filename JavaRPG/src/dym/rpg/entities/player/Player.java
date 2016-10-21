package dym.rpg.entities.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Input;
import dym.rpg.entities.Entity;
import dym.rpg.physics.Vector2;

public class Player extends Entity {
	double xspeed,yspeed;
	public Player(Vector2 vec) {
		xspeed=0;yspeed=0;
	}
	@Override
	public void update() {
		pos.x+=xspeed;
		pos.y+=yspeed;
		
		//Only continue if player is aligned with grid//
		if (!(pos.x%32==0 && pos.y%32==0)) return;
		
		xspeed=0;
		yspeed=0;
		int speed = 2;
		if (Input.keysDown.contains(KeyEvent.VK_Z)) {
			speed=4;
		}
		if (Input.keysDown.contains(KeyEvent.VK_UP)) {
			yspeed-=speed;
		}
		if (Input.keysDown.contains(KeyEvent.VK_DOWN)) {
			yspeed+=speed;
		}
		if (yspeed==0) {
			if (Input.keysDown.contains(KeyEvent.VK_LEFT)) {
				xspeed-=speed;
			}
			if (Input.keysDown.contains(KeyEvent.VK_RIGHT)) {
				xspeed+=speed;
			}
		}
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int)pos.x, (int)pos.y, 32, 32);
	}
}
