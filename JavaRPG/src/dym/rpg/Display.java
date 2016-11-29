package dym.rpg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import dym.rpg.physics.Collision;
import dym.rpg.scene.SceneManager;


public class Display extends JPanel {
	
	private static final long serialVersionUID = -1960615037265171080L;
	public static final int WIDTH = 320, HEIGHT = 240;
	Game game;
	public Display(Game g) {
		game = g;
	}
	public double ScaleCoordinateX(double x) {
		if (x>=0)
			return Math.max(game.getWidth()*x/WIDTH,x);
		else
			return Math.min(game.getWidth()*x/WIDTH,x);
	}
	public double ScaleCoordinateY(double y) {
		if (y>=0)
			return Math.max(game.getHeight()*y/HEIGHT,y);
		else
			return Math.min(game.getHeight()*y/HEIGHT,y);
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, game.getWidth(), game.getHeight());
		
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
	}
}
