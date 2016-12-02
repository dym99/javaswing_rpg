package dym.rpg.entities.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Display;
import dym.rpg.Input;
import dym.rpg.entities.Entity;
import dym.rpg.physics.Rect;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.SceneManager;

public class SettingsScreenHandler extends Entity {
	int tab = 1;
	int dScale = 4;
	public SettingsScreenHandler() {
		super (new Vector2(), new Rect(0,0,320,240));
	}
	
	@Override
	public void update() {
		if (Input.keysDown.contains(KeyEvent.VK_LEFT)) {
			tab-=1;
			if (tab < 1) tab=1;
			Input.keysDown.remove((Object)KeyEvent.VK_LEFT);
		}
		if (Input.keysDown.contains(KeyEvent.VK_RIGHT)) {
			tab+=1;
			if (tab > 3) tab=3;
			Input.keysDown.remove((Object)KeyEvent.VK_RIGHT);
		}
		if (Input.keysDown.contains(KeyEvent.VK_UP)) {
			
			
			
			Input.keysDown.remove((Object)KeyEvent.VK_UP);
		}
		if (Input.keysDown.contains(KeyEvent.VK_DOWN)) {
			
			
			
			Input.keysDown.remove((Object)KeyEvent.VK_DOWN);
		}
		if (Input.keysDown.contains(KeyEvent.VK_X)) {
			//Toggle current setting
			dScale++;
			if (dScale>4) dScale = 1;
			Display.width = dScale*Display.WIDTH;
			Display.height = dScale*Display.HEIGHT;
			Input.keysDown.remove((Object)KeyEvent.VK_X);
		}
		if (Input.keysDown.contains(KeyEvent.VK_Z)) {
			//Return to game
			SceneManager.gotoPrev();
			Input.keysDown.remove((Object)KeyEvent.VK_Z);
		}
		
		
		
	}
	@Override
	public void draw(Graphics g) {
		
	}
}
