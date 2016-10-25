package dym.rpg.graphics.staticSprites;

import java.io.File;

import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;

public class SprCharD extends Sprite {
	private static Image images[]={new Image(new File("/res/char/char_d1.png")),new Image(new File("/res/char/char_d2.png")),new Image(new File("/res/char/char_d1.png")),new Image(new File("/res/char/char_d3.png"))};
	public SprCharD() {
		super(images);
	}
}
