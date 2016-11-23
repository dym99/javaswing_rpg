package dym.rpg.graphics.staticSprites;

import java.io.File;

import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;

public class SprCharU extends Sprite {
	private static Image images[]={new Image(new File("res\\char\\char_u1.png")),new Image(new File("res\\char\\char_u2.png")),new Image(new File("res\\char\\char_u1.png")),new Image(new File("res\\char\\char_u3.png"))};
	public SprCharU() {
		super(images);
		fps = 6;
	}
}
