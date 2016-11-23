package dym.rpg.graphics.staticSprites;

import java.io.File;

import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;

public class SprCharL extends Sprite {
	private static Image images[]={new Image(new File("res\\char\\char_l1.png")),new Image(new File("res\\char\\char_l2.png")),new Image(new File("res\\char\\char_l1.png")),new Image(new File("res\\char\\char_l3.png"))};
	public SprCharL() {
		super(images);
		fps = 6;
	}
}
