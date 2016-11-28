package dym.rpg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Input implements KeyListener{
	public static ArrayList<Integer> keysDown;
	public enum AxisState {
		NONE,
		HORIZONTAL,
		VERTICAL
	};
	public static AxisState axisState;
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

}
