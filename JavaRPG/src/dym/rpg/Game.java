package dym.rpg;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;

import dym.rpg.entities.player.Player;
import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;
import dym.rpg.graphics.staticSprites.SprCharD;
import dym.rpg.graphics.staticSprites.SprCharL;
import dym.rpg.graphics.staticSprites.SprCharR;
import dym.rpg.graphics.staticSprites.SprCharU;
import dym.rpg.maps.TestMap;
import dym.rpg.physics.CollisionMap;
import dym.rpg.physics.Vector2;

public class Game extends JFrame {
	private static final long serialVersionUID = 665457190433165744L;
	private static Display d;
	private static Input i;
	public static Player p;

	public static Image imgCharShadow = new Image(new File("res\\char\\char_shadow.png"));
	
	public static SprCharD sprCharD = new SprCharD();
	public static SprCharU sprCharU = new SprCharU();
	public static SprCharL sprCharL = new SprCharL();
	public static SprCharR sprCharR = new SprCharR();
	public static Sprite charSprite = sprCharD;
	public static Game g;
	
	public static TestMap cmap = new TestMap();
	
	public Game() {
		super("Game");
		this.setSize(1280,720);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
		this.addKeyListener(i);
		i = new Input();
		d = new Display();
		p = new Player(new Vector2(64,64));
		this.add(d,BorderLayout.CENTER);
		this.addKeyListener(i);
		while (true) loop();
	}
	public static void main(String args[]) {
		g = new Game();
	}
	public static void loop() {
		try {
			p.update();
			if (p.isMoving())
				charSprite.animate();
			else
				charSprite.resetAnim();
			d.repaint();
			//System.out.println("Keys: "+Input.keysDown);
			Thread.sleep(1000/60);
		} catch (InterruptedException e) 
		{e.printStackTrace();}
	}
}
