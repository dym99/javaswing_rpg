package dym.rpg.graphics.text;

import java.io.File;
import java.util.HashMap;

import dym.rpg.graphics.Image;

public class ClockText {
	private static HashMap<Character,Image> images = new HashMap<Character,Image>();
	public static void init() {
		
		images.put('0', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"00.png")));
		images.put('1', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"01.png")));
		images.put('2', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"02.png")));
		images.put('3', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"03.png")));
		images.put('4', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"04.png")));
		images.put('5', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"05.png")));
		images.put('6', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"06.png")));
		images.put('7', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"07.png")));
		images.put('8', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"08.png")));
		images.put('9', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"09.png")));
		images.put(':', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"10.png")));
		images.put('A', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"11.png")));
		images.put('P', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"12.png")));
		images.put('M', new Image(new File("res"+File.separator+"font"+File.separator+"mini"+File.separator+"13.png")));
	}
	public static Image getCharacterImage(char c) {
		return images.get(c);
	}
}
