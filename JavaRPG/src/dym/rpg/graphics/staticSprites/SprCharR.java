package dym.rpg.graphics.staticSprites;

import java.io.File;

import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;

public class SprCharR extends Sprite {
	private static Image images[]={ new Image(new File("res"+File.separator+"char"+File.separator+"char_r1.png")),
									new Image(new File("res"+File.separator+"char"+File.separator+"char_r2.png")),
									new Image(new File("res"+File.separator+"char"+File.separator+"char_r1.png")),
									new Image(new File("res"+File.separator+"char"+File.separator+"char_r3.png"))};
	public SprCharR() {
		super(images);
		fps = 6;
	}
}
