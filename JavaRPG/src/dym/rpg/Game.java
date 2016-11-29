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
import dym.rpg.physics.Vector2;
import dym.rpg.scene.SceneManager;
import dym.rpg.sound.Sound;
import dym.rpg.sound.SoundMixer;
import dym.rpg.sound.staticSounds.TestMusic;
//import dym.rpg.sound.staticSounds.TestSFX;

public class Game extends JFrame {
	private static final long serialVersionUID = 665457190433165744L;
	private static Display d;
	private static Input i;
	public static Player p;

	public static Image imgCharShadow = new Image(new File("res"+File.separator+"char"+File.separator+"char_shadow.png"));
	
	public static SprCharD sprCharD = new SprCharD();
	public static SprCharU sprCharU = new SprCharU();
	public static SprCharL sprCharL = new SprCharL();
	public static SprCharR sprCharR = new SprCharR();
	
	public static TestMusic testMusic;
	//public static TestSFX testSFX;
	
	public static Sprite charSprite = sprCharD;
	public static Game g;
	
	public Game() {
		super("Game");
		SoundMixer.init();
		testMusic = new TestMusic();
		//testSFX = new TestSFX();
		SoundMixer.playMusic(testMusic);
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
		validate();
		while (true) {
			loop();
		}
	}
	public static void main(String args[]) {
		g = new Game();
	}
	public static void loop() {
		try {
			if (!SceneManager.currentScene.menuScene) {
				p.update();
				if (p.isMoving())
					charSprite.animate();
				else
					charSprite.resetAnim();
			}
			SceneManager.currentScene.update();
			d.repaint();
			//System.out.println("Keys: "+Input.keysDown);
			Thread.sleep(1000/60);
		} catch (InterruptedException e) 
		{e.printStackTrace();}
	}
}
