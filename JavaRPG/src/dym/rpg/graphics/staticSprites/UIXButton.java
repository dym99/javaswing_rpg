package dym.rpg.graphics.staticSprites;

import java.io.File;

import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;

public class UIXButton extends Sprite {
	private static Image images[]={ new Image(new File("res"+File.separator+"ui"+File.separator+"xbutton0.png")),
									new Image(new File("res"+File.separator+"ui"+File.separator+"xbutton1.png"))};
	public UIXButton() {
		super(images);
		fps = 2;
	}

}
