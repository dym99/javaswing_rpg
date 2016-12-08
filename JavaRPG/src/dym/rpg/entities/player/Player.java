package dym.rpg.entities.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Game;
import dym.rpg.Input;
import dym.rpg.Input.AxisState;
import dym.rpg.MessageHandler;
import dym.rpg.entities.Entity;
import dym.rpg.physics.CollisionMap;
import dym.rpg.physics.CollisionMap.CollisionType;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.SceneManager;
import dym.rpg.sound.SoundMixer;

public class Player extends Entity {
	double xspeed,yspeed;
	public boolean busy, menu;
	public Player(Vector2 vec) {
		super(vec);
		xspeed=0;yspeed=0;
		busy = false;
		menu = false;
	}
	public boolean isMoving() 
	{
		return !(xspeed==0&&yspeed==0);
	}
	@Override
	public void update() {
		if (menu) {
			//Do menu things
			Game.menu.update();
			//
			if (Input.keysDown.contains(KeyEvent.VK_C)) {
				//Close Menu
				busy = false;
				menu = false;
				Input.keysDown.remove((Object)KeyEvent.VK_C);
			}
			if (Input.keysDown.contains(KeyEvent.VK_ESCAPE)) {
				//Close Menu
				busy = false;
				menu = false;
				Input.keysDown.remove((Object)KeyEvent.VK_ESCAPE);
			}
		} else {
			Game.menu.resetSelection();
		}
		if (busy||menu) return;
		
		pos.x+=xspeed;
		pos.y+=yspeed;
		bbox.x=pos.x;
		bbox.y=pos.y;
		if (isMoving())
			Game.charSprite.animate();
		else
			Game.charSprite.resetAnim();
		
		if (Input.keysDown.contains(KeyEvent.VK_C)) {
			//Open the menu;
			busy = true;
			menu = true;
			Input.keysDown.remove((Object)KeyEvent.VK_C);
		}
//		if (Input.keysDown.contains(KeyEvent.VK_P)) {
//			System.err.println("Current music position: "+SoundMixer.music.getFramePosition());
//			Input.keysDown.remove((Object)KeyEvent.VK_P);
//		}
		//Only continue if player is aligned with grid//
		if (!(pos.x%16==0 && pos.y%16==0)) return;
		xspeed=0;
		yspeed=0;
		int speed = 1;
		if (Input.keysDown.contains(KeyEvent.VK_Z)) {
			//Test the message box.
			MessageHandler.addMessage("You have pressed Z, the\nmessage testing keybind.");
			MessageHandler.addMessage("While this may be obvious,\nthis is just a test.");
			Input.keysDown.remove((Object)KeyEvent.VK_Z);
		}
		if (Input.keysDown.contains(KeyEvent.VK_X)) {
			//Interact with an entity in the direction you are facing.
			
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
