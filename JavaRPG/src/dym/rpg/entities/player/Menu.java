package dym.rpg.entities.player;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Game;
import dym.rpg.Input;
import dym.rpg.entities.Entity;
import dym.rpg.scene.Scene;
import dym.rpg.scene.SceneManager;

public class Menu extends Entity{
	public static final int selections = 3;
	public static final Scene[] selectionDestinations = {SceneManager.currentScene, SceneManager.currentScene, SceneManager.settings};
	private static int arrowlocation; 
	public Menu() {
		//Set the starting arrow location;
		arrowlocation = 13;
	}
	public void resetSelection() {
		arrowlocation = 13;
	}
	@Override
	public void update() {
		Game.uiMenuArrow.animate();
		if (Input.keysDown.contains(KeyEvent.VK_DOWN)) {
			//Move arrow down
			if (arrowlocation<13+20*(selections-1)) {
				arrowlocation+=20;
			}
			Input.keysDown.remove((Object)KeyEvent.VK_DOWN);
		}
		if (Input.keysDown.contains(KeyEvent.VK_UP)) {
			//Move arrow up
			if (arrowlocation>13) {
				arrowlocation-=20;
			}
			Input.keysDown.remove((Object)KeyEvent.VK_UP);
		}
		if (Input.keysDown.contains(KeyEvent.VK_X)) {
			//Goto selected sub-menu
			
			SceneManager.gotoScene(selectionDestinations[(int)((arrowlocation-13)/20)]);
			Game.p.menu = false;
			Game.p.busy = false;
			Input.keysDown.remove((Object)KeyEvent.VK_X);
		}
	}
	@Override
	public void draw(Graphics g) {
		Game.uiMenu.drawUI(g, 0, 0);
		Game.uiMenuParty.drawUI(g, 241, 13);
		Game.uiMenuInventory.drawUI(g, 241, 33);
		Game.uiMenuSettings.drawUI(g, 241, 53);
		Game.uiMenuArrow.drawUI(g, 241, arrowlocation);
	}
}
