package dym.rpg.graphics.staticSprites;

import java.io.File;

import dym.rpg.graphics.Image;
import dym.rpg.graphics.Sprite;

public class UIArrow extends Sprite {
	private static Image images[]={ new Image(new File("res"+File.separator+"ui"+File.separator+"arrow1.png")),
									new Image(new File("res"+File.separator+"ui"+File.separator+"arrow2.png"))};
	public UIArrow() {
		super(images);
		fps = 4;
	}

}
