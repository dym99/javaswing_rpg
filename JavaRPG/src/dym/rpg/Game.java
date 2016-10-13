package dym.rpg;

import javax.swing.JFrame;

public class Game extends JFrame {
	private static final long serialVersionUID = 665457190433165744L;
	private static Display d;
	private static Input i;

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
			d.repaint();
			//System.out.println("Keys: "+Input.keysDown);
			Thread.sleep(15);
		} catch (InterruptedException e) 
		{e.printStackTrace();}
	}
}
