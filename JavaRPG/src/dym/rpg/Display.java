package dym.rpg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import dym.rpg.scene.SceneManager;


public class Display extends JPanel {
	
	private static final long serialVersionUID = -1960615037265171080L;
	public static final int WIDTH = 320, HEIGHT = 240;
	Game game;
	public Display(Game g) {
		game = g;
	}
	public double ScaleCoordinateX(double x) {
		return (this.getWidth()*x/WIDTH)-1;
	}
	public double ScaleCoordinateY(double y) {
		return (this.getHeight()*y/HEIGHT)-1;
	}
	public void paintComponent(Graphics g) {
		setSize(new Dimension(1280,960));
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
//		g.setColor(Color.GREEN);
//		for (int x=0;x<1280;x+=16) {
//			g.drawLine(x, 0, x, 720);	
//		}
//		for (int y=0;y<720;y+=16) {
//			g.drawLine(0, y, 1280, y);
//		}
//		g.setColor(Color.RED);
//		for (Collision c : SceneManager.currentScene.collisionMap.collisions) {
//			g.drawRect(c.x, c.y, 16, 16);
//		}
		if (!SceneManager.currentScene.menuScene)
			Game.p.draw(g);
		if (Game.p.menu) {
			Game.menu.draw(g);
		}
	}
}
