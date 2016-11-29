package dym.rpg.entities.menu;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Input;
import dym.rpg.entities.Entity;
import dym.rpg.graphics.Image;
import dym.rpg.scene.SceneManager;
import dym.rpg.scene.staticScenes.MenuUI;

public class Button extends Entity {
	public Button() {
		
	}
	@Override
	public void draw(Graphics g) {
		MenuUI.ded.draw(g, (int)this.pos.x, (int)this.pos.y);
	}
	
	@Override
	public void update() {
		if(Input.keysDown.contains((Object)KeyEvent.VK_UP))
		{	
			SceneManager.currentScene = SceneManager.testScene1;
		}
	}
}
