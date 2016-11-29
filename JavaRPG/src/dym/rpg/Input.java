package dym.rpg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import dym.rpg.entities.Entity;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.SceneManager;

public class Input implements KeyListener, MouseListener{
	public static ArrayList<Integer> keysDown;
	public static ArrayList<Integer> mouseDown;
	public enum AxisState {
		NONE,
		HORIZONTAL,
		VERTICAL
	};
	public static AxisState axisState;
	public Input() {
		keysDown = new ArrayList<Integer>();
		mouseDown = new ArrayList<Integer>();
	}

	public void click(int x, int y) {
		for (Entity e : SceneManager.currentScene.entities) {
			if (e.bbox.collidePoint(new Vector2(x,y))) {
				e.click();
			}
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (!keysDown.contains(e.getKeyCode())) {
			keysDown.add(e.getKeyCode());
		}
		if (e.getKeyCode()==KeyEvent.VK_UP || e.getKeyCode()==KeyEvent.VK_DOWN) {
			axisState = AxisState.VERTICAL;
		}
		else if (e.getKeyCode()==KeyEvent.VK_LEFT || e.getKeyCode()==KeyEvent.VK_RIGHT) {
			axisState = AxisState.HORIZONTAL;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (keysDown.contains(e.getKeyCode())) {
			keysDown.remove((Object)e.getKeyCode());
		}
		if (e.getKeyCode()==KeyEvent.VK_UP || e.getKeyCode()==KeyEvent.VK_DOWN || e.getKeyCode()==KeyEvent.VK_LEFT || e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if (keysDown.contains(KeyEvent.VK_LEFT) || keysDown.contains(KeyEvent.VK_RIGHT)){
				axisState = AxisState.HORIZONTAL;
			} else if (keysDown.contains(KeyEvent.VK_UP) || keysDown.contains(KeyEvent.VK_DOWN)){
				axisState = AxisState.VERTICAL;
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) { }

	@Override
	public void mousePressed(MouseEvent e) {
		if (!mouseDown.contains(e.getButton())) {
			mouseDown.add(e.getButton());
		}
		click(e.getX(),e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (mouseDown.contains(e.getButton())) {
			mouseDown.remove((Object)e.getButton());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) { }

	@Override
	public void mouseExited(MouseEvent e) {	}
	
	

}
