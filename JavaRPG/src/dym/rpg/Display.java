package dym.rpg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JPanel;

import dym.rpg.entities.Entity;
import dym.rpg.graphics.text.DefaultFont;
import dym.rpg.scene.SceneManager;


public class Display extends JPanel {
	private static final long serialVersionUID = -1960615037265171080L;
	//Width and height of the view.
	public static final int WIDTH = 320, HEIGHT = 240;
	//Width and height of the display.
	public static int width = 1280, height = 960;
	
	//Reference to the Window.
	Game game;
	public Display(Game g) {
		game = g;
	}
	//Scale coordinates from view to fit on display.
	public double ScaleCoordinateX(double x) {
		if (width>320)
			return (this.getWidth()*x/WIDTH)-1;
		return (this.getWidth()*x/WIDTH);
	}
	public double ScaleCoordinateY(double y) {
		if (height>240)
			return (this.getHeight()*y/HEIGHT)-1 ;
		return (this.getHeight()*y/HEIGHT);
	}
	public void paintComponent(Graphics g) {
		//Scale and center the display on the window;
		setSize(new Dimension(width,height));
		if (this.getWidth()>1280 || this.getHeight()>960) {
			this.setSize(new Dimension(1280, 960));
		}
		if (this.getWidth()<320 || this.getHeight()<240) {
			this.setSize(new Dimension(320, 240));
		}
		setLocation(game.getWidth()/2-getWidth()/2, game.getHeight()/2-getHeight()/2);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//Draw all tiles.
		SceneManager.currentScene.tileMap.drawTiles(g);
		for (Entity e : SceneManager.currentScene.entities) {
			e.draw(g);
		}
		//Draw the player (Unless on menu)
		if (!SceneManager.currentScene.menuScene)
			Game.p.draw(g);
		
		
		
		if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)>=18 || Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<6) {
			g.setColor(new Color(0,0,0,177));
			g.fillRect(0, 0, this.width, this.height);
			g.setColor(Color.WHITE);
		}
		//Draw clock
		Game.uiClock.drawUI(g, 0, 0);
		String ampm="am";
		if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)>=12) {
			ampm="pm";
		}
		int hours = Calendar.getInstance().get(Calendar.HOUR);
		String hourText;
		if (hours<10) {
			hourText = "0"+hours;
		} else {
			hourText = hours+"";
		}
		int minutes = Calendar.getInstance().get(Calendar.MINUTE);
		String minuteText;
		if (minutes<10) {
			minuteText = "0"+minutes;
		} else {
			minuteText = minutes+"";
		}
		String timeText=hourText+":"+minuteText+" "+ampm;
		int pos = 0;
		for (char c:timeText.toUpperCase().toCharArray()) {
			if (DefaultFont.getCharacterImage(c)!=null)
				DefaultFont.getCharacterImage(c).drawUI(g, pos*10+5, 2);
			pos++;
		}
		//Draw pop-up menu;
		if (Game.p.menu) {
			Game.menu.draw(g);
		}
		if (MessageHandler.busy) {
			MessageHandler.draw(g);
		}
		
	}
}
