package dym.rpg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Input implements KeyListener{
	public static ArrayList<Integer> keysDown;

	public Input() {
		keysDown = new ArrayList<Integer>();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (!keysDown.contains(e.getKeyCode())) {
			keysDown.add(e.getKeyCode());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (keysDown.contains(e.getKeyCode())) {
			keysDown.remove((Object)e.getKeyCode());
		}
	}

}
