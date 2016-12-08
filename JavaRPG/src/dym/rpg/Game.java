package dym.rpg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dym.rpg.entities.Entity;
import dym.rpg.entities.player.Menu;
import dym.rpg.entities.player.Player;
import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;
import dym.rpg.graphics.staticImages.UIClock;
import dym.rpg.graphics.staticImages.UIMenu;
import dym.rpg.graphics.staticImages.UIMenuInventoryButton;
import dym.rpg.graphics.staticImages.UIMenuPartyButton;
import dym.rpg.graphics.staticImages.UIMenuSettingsButton;
import dym.rpg.graphics.staticImages.UITextBox;
import dym.rpg.graphics.staticSprites.SprCharD;
import dym.rpg.graphics.staticSprites.SprCharL;
import dym.rpg.graphics.staticSprites.SprCharR;
import dym.rpg.graphics.staticSprites.SprCharU;
import dym.rpg.graphics.staticSprites.UIArrow;
import dym.rpg.graphics.staticSprites.UIXButton;
import dym.rpg.graphics.text.DefaultFont;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.SceneManager;
import dym.rpg.sound.SoundMixer;
//import dym.rpg.sound.staticSounds.TestMusic;
//import dym.rpg.sound.staticSounds.TestSFX;

public class Game extends JFrame {
	private static final long serialVersionUID = 665457190433165744L;
	public static Display d;
	private static Input i;
	public static Player p;

	public static Image imgCharShadow = new Image(new File("res"+File.separator+"char"+File.separator+"char_shadow.png"));
	
	public static SprCharD sprCharD = new SprCharD();
	public static SprCharU sprCharU = new SprCharU();
	public static SprCharL sprCharL = new SprCharL();
	public static SprCharR sprCharR = new SprCharR();
	
	public static Vector2 camera = new Vector2();
	
	public static Menu menu = new Menu();
	public static UIMenu uiMenu = new UIMenu(); 
	public static UIMenuPartyButton uiMenuParty = new UIMenuPartyButton(); 
	public static UIMenuInventoryButton uiMenuInventory = new UIMenuInventoryButton(); 
	public static UIMenuSettingsButton uiMenuSettings = new UIMenuSettingsButton(); 
	public static UIArrow uiMenuArrow = new UIArrow(); 
	public static UIXButton uiXButton = new UIXButton(); 
	public static UITextBox uiTextBox = new UITextBox(); 
	public static UIClock uiClock = new UIClock(); 
	//public static TestMusic testMusic;
	//public static TestSFX testSFX;
	
	public static Sprite charSprite = sprCharD;
	public static Game g;
	public JPanel content;
	public Game() {
		super("Game");
		SoundMixer.init();
		DefaultFont.init();
		this.setBackground(Color.BLACK);
		
		//testMusic = new TestMusic();
		//testSFX = new TestSFX();
		//SoundMixer.playMusic(testMusic);
		//this.setSize(1280,960);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		content = new JPanel() {
			private static final long serialVersionUID = 2914100608897241233L;
			@Override
			public void paintComponent(Graphics g) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		content.setLayout(new GridBagLayout());
		i = new Input();
		this.addKeyListener(i);
		d = new Display(this);
		d.addMouseListener(i);
		p = new Player(new Vector2(64,64));
		this.setLayout(new GridLayout(1,1));
		this.addKeyListener(i);
		this.setContentPane(content);
		this.add(d);
		this.setVisible(true);
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
			MessageHandler.update();
			if (!SceneManager.currentScene.menuScene) {
				camera.x = p.bbox.x-160+8;
				camera.y = p.bbox.y-120+8;
				p.update();
			}
			for (Entity e : SceneManager.currentScene.entities) {
				e.update();
			}
			d.repaint();
			//System.out.println("Keys: "+Input.keysDown);
			
			Thread.sleep(1000/60);
		} catch (InterruptedException e) 
		{e.printStackTrace();}
	}
}
