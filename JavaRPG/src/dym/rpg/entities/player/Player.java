package dym.rpg.entities.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Game;
import dym.rpg.Input;
import dym.rpg.Input.AxisState;
import dym.rpg.entities.Entity;
import dym.rpg.physics.CollisionMap;
import dym.rpg.physics.CollisionMap.CollisionType;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.SceneManager;
import dym.rpg.sound.Sound;
import dym.rpg.sound.SoundMixer;

public class Player extends Entity {
	double xspeed,yspeed;
	public Player(Vector2 vec) {
		super(vec);
		xspeed=0;yspeed=0;
	}
	public boolean isMoving() 
	{
		return !(xspeed==0&&yspeed==0);
	}
	@Override
	public void update() {
		pos.x+=xspeed;
		pos.y+=yspeed;
		
		//Only continue if player is aligned with grid//
		if (!(pos.x%16==0 && pos.y%16==0)) return;
		xspeed=0;
		yspeed=0;
		int speed = 1;
		if (Input.keysDown.contains(KeyEvent.VK_Z)) {
			speed=2;
		}
		if (Input.keysDown.contains(KeyEvent.VK_X)) {
			//System.err.println("Current music position: "+SoundMixer.music.getFramePosition());
			//Game.testSFX.play();
			if (SceneManager.currentScene==SceneManager.testScene1) {
				SceneManager.currentScene=SceneManager.testScene2;
			}
			else {
				SceneManager.currentScene=SceneManager.testScene1;
			}
			Input.keysDown.remove((Object)KeyEvent.VK_X);
		}
	
		if (Input.axisState == AxisState.VERTICAL) {
			if (Input.keysDown.contains(KeyEvent.VK_UP)) {
				yspeed-=speed;
			}
			if (Input.keysDown.contains(KeyEvent.VK_DOWN)) {
				yspeed+=speed;
			}
		}
		if (Input.axisState == AxisState.HORIZONTAL) {
			if (Input.keysDown.contains(KeyEvent.VK_LEFT)) {
				xspeed-=speed;
			}
			if (Input.keysDown.contains(KeyEvent.VK_RIGHT)) {
				xspeed+=speed;
			}
		}
		if (yspeed > 0) {
			Game.charSprite = Game.sprCharD;
		}
		if (yspeed < 0) {
			Game.charSprite = Game.sprCharU;
		}
		if (xspeed > 0) {
			Game.charSprite = Game.sprCharR;
		}
		if (xspeed < 0) {
			Game.charSprite = Game.sprCharL;
		}
		if (pathCheck(SceneManager.currentScene.collisionMap)!=CollisionType.NONE) {xspeed=0; yspeed=0;}
	}
	public CollisionType pathCheck(CollisionMap cMap) {
		if (xspeed>0) {
			return (cMap.getCollsionAt((int)pos.x+16, (int)pos.y));
		}
		if (xspeed<0) {
			return (cMap.getCollsionAt((int)pos.x-16, (int)pos.y));
		}
		if (yspeed>0) {
			return (cMap.getCollsionAt((int)pos.x, (int)pos.y+16));
		}
		if (yspeed<0) {
			return (cMap.getCollsionAt((int)pos.x, (int)pos.y-16));
		}
		return CollisionType.NONE;
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		Game.imgCharShadow.draw(g, (int)Game.p.pos.x-8, (int)Game.p.pos.y-18);
		Game.charSprite.draw(g, (int)Game.p.pos.x-8, (int)Game.p.pos.y-20);
		g.setColor(Color.BLUE);
	}
}
