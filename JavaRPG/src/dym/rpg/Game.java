package dym.rpg;

import javax.swing.JFrame;

import dym.rpg.entities.player.Player;
import dym.rpg.physics.Vector2;

public class Game extends JFrame {
	private static final long serialVersionUID = 665457190433165744L;
	private static Display d;
	private static Input i;

	public static Player p;
	
	public static Game g;
	
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
		this.setContentPane(d);
		this.addKeyListener(i);
		pack();
		while (true) loop();
	}
	
	public static void main(String args[]) {
		g = new Game();
	}
	public static void loop() {
		try {
			p.update();
			d.repaint();
			//System.out.println("Keys: "+Input.keysDown);
			Thread.sleep(15);
		} catch (InterruptedException e) 
		{e.printStackTrace();}
	}
}
