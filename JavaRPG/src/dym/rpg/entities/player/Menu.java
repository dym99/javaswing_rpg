package dym.rpg.entities.player;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import dym.rpg.Game;
import dym.rpg.Input;
import dym.rpg.entities.Entity;

public class Menu extends Entity{
	public static final int selections = 3;
	private static int arrowlocation; 
	public Menu() {
		arrowlocation = 13;
	}
	public void resetSelection() {
		arrowlocation = 13;
	}
	@Override
	public void update() {
		Game.uiMenuArrow.animate();
		if (Input.keysDown.contains(KeyEvent.VK_DOWN)) {
			if (arrowlocation<13+20*(selections-1)) {
				arrowlocation+=20;
			}
			Input.keysDown.remove((Object)KeyEvent.VK_DOWN);
		}
		if (Input.keysDown.contains(KeyEvent.VK_UP)) {
			if (arrowlocation>13) {
				arrowlocation-=20;
			}
			Input.keysDown.remove((Object)KeyEvent.VK_UP);
		}
	}
	@Override
	public void draw(Graphics g) {
		Game.uiMenu.draw(g, 0, 0);
		Game.uiMenuParty.draw(g, 241, 13);
		Game.uiMenuParty.draw(g, 241, 33);
		Game.uiMenuParty.draw(g, 241, 53);
		Game.uiMenuArrow.draw(g, 241, arrowlocation);
	}
}
