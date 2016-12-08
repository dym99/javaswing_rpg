package dym.rpg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import dym.rpg.graphics.text.DefaultFont;

public class MessageHandler {
	public static ArrayList<String> messages = new ArrayList<String>();
	static String currentMessage = "", visibleMessage = "";
	public static boolean busy = false, animating = true;
	public static void addMessage(String message) {
		messages.add(message);
		animating=true;
	}
	public static void update() {
		animate();
		if (animating)return;
		if (busy) {
			if (Input.keysDown.contains(KeyEvent.VK_X)) {
				currentMessage="";
				visibleMessage="";
				Input.keysDown.remove((Object)KeyEvent.VK_X);
			}
		}
		if (messages.size()>0&&currentMessage=="") {
			currentMessage = messages.get(0);
			busy = true;
			Game.p.busy=true;
			messages.remove(0);
		}
		if (messages.size()==0&&currentMessage=="") {
			busy = false;
			Game.p.busy=false;
		}
	
	}
	//Move to next letter and animate the "Press X" icon
	public static void animate() {
		if (visibleMessage.length()<currentMessage.length()) {animating = true; visibleMessage+=currentMessage.charAt(visibleMessage.length());} else {animating=false;}
		Game.uiXButton.animate();
	}
	public static void draw(Graphics g) {
		g.setColor(Color.WHITE);
		Game.uiTextBox.drawUI(g, 0, 0);
		int pos=0, row=0;
		int rowh=22, charw=10;
		for (char c:visibleMessage.toUpperCase().toCharArray()) {
			if (DefaultFont.getCharacterImage(c)!=null)
				DefaultFont.getCharacterImage(c).drawUI(g, pos*charw+15, row*rowh+160);
			else if (c=='\n') {
				pos=-1;
				row++;
			}
			pos++;
			
			if(pos==29) {
				pos=0;
				row++;
			}
		}
		if (visibleMessage.length()<currentMessage.length()) {animating = true;Game.uiXButton.resetAnim();} else {animating=false;}
		if (!animating) Game.uiXButton.drawUI(g, 320-26, 240-26);
	}
}
