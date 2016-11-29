package dym.rpg.scene.staticScenes;

import java.io.File;

import dym.rpg.entities.menu.Button;
import dym.rpg.graphics.Image;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.Scene;
import dym.rpg.tile.Tile;

public class MenuUI extends Scene {
	public static Image ded = new Image(new File("res"+File.separator+"butt"+File.separator+"button_1.png"));
	
	public MenuUI() {
		super(true);
		entities.add(new Button());
	}
}
