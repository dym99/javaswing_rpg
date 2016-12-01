package dym.rpg.scene.staticScenes;

import java.io.File;

import dym.rpg.entities.menu.Button;
import dym.rpg.graphics.Image;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.Scene;
import dym.rpg.tile.Tile;

public class MenuUI extends Scene {
	/*
	 * If you're wondering why there are a lot of these here, let me explain. The menu UI isn't done yet. So, that's why I have 
	 * a ton of these. They're very helpful.	
	public static Image = new Image(new File("res"+File.separator+"butt"+File.separator+".png"));
	public static Image = new Image(new File("res"+File.separator+"butt"+File.separator+".png"));
	public static Image = new Image(new File("res"+File.separator+"butt"+File.separator+".png"));
	public static Image = new Image(new File("res"+File.separator+"butt"+File.separator+".png"));
	public static Image = new Image(new File("res"+File.separator+"butt"+File.separator+".png"));
	public static Image = new Image(new File("res"+File.separator+"butt"+File.separator+".png"));

	 */
	public static Image ded = new Image(new File("res"+File.separator+"butt"+File.separator+"button_1.png"));
	public static Image t_newGame= new Image(new File("res"+File.separator+"butt"+File.separator+"temp_newGame.png"));
	
	
	public MenuUI() {
		super(true);
		entities.add(new Button());
	}
}

