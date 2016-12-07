package dym.rpg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import dym.rpg.entities.Entity;
import dym.rpg.scene.SceneManager;


public class Display extends JPanel {
	
	private static final long serialVersionUID = -1960615037265171080L;
	public static final int WIDTH = 320, HEIGHT = 240;
	public static int width = 1280, height = 960;
	Game game;
	public Display(Game g) {
		game = g;
	}
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
		
		SceneManager.currentScene.tileMap.drawTiles(g);
		for (Entity e : SceneManager.currentScene.entities) {
			e.draw(g);
		}

		if (!SceneManager.currentScene.menuScene)
			Game.p.draw(g);
		if (Game.p.menu) {
			Game.menu.draw(g);
		}
		if (MessageHandler.busy) {
			MessageHandler.draw(g);
		}
		
	}
}
