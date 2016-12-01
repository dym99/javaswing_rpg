package dym.rpg.entities.menu;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Input;
import dym.rpg.entities.Entity;
import dym.rpg.graphics.Image;
import dym.rpg.scene.SceneManager;
import dym.rpg.scene.staticScenes.MenuUI;
import dym.rpg.scene.staticScenes.TestScene2;

public class Button extends Entity {
	public Button() {
		
	}
	@Override
	public void draw(Graphics g) {
		MenuUI.ded.draw(g, (int)this.pos.x, (int)this.pos.y);
		MenuUI.t_newGame.draw(g, 600, 150);
		//TestScene2.esc.draw(g, 1000, 16);
	}
	
	@Override
	public void update() {
		if(Input.keysDown.contains((Object)KeyEvent.VK_UP))
		{	
			SceneManager.currentScene = SceneManager.testScene1;
		}
		if(Input.keysDown.contains((Object)KeyEvent.VK_ENTER)){
			SceneManager.currentScene = SceneManager.testScene2;
		}
	}
}
