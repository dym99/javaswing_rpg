package dym.rpg.graphics.text;

import java.io.File;
import java.util.HashMap;

import dym.rpg.graphics.Image;

public class DefaultFont {
	private static HashMap<Character,Image> images = new HashMap<Character,Image>();
	public static void init() {
		images.put('A', new Image(new File("res"+File.separator+"font"+File.separator+"a.png")));
		images.put('B', new Image(new File("res"+File.separator+"font"+File.separator+"b.png")));
		images.put('C', new Image(new File("res"+File.separator+"font"+File.separator+"c.png")));
		images.put('D', new Image(new File("res"+File.separator+"font"+File.separator+"d.png")));
		images.put('E', new Image(new File("res"+File.separator+"font"+File.separator+"e.png")));
		images.put('F', new Image(new File("res"+File.separator+"font"+File.separator+"f.png")));
		images.put('G', new Image(new File("res"+File.separator+"font"+File.separator+"g.png")));
		images.put('H', new Image(new File("res"+File.separator+"font"+File.separator+"h.png")));
		images.put('I', new Image(new File("res"+File.separator+"font"+File.separator+"i.png")));
		images.put('J', new Image(new File("res"+File.separator+"font"+File.separator+"j.png")));
		images.put('K', new Image(new File("res"+File.separator+"font"+File.separator+"k.png")));
		images.put('L', new Image(new File("res"+File.separator+"font"+File.separator+"l.png")));
		images.put('M', new Image(new File("res"+File.separator+"font"+File.separator+"m.png")));
		images.put('N', new Image(new File("res"+File.separator+"font"+File.separator+"n.png")));
		images.put('O', new Image(new File("res"+File.separator+"font"+File.separator+"o.png")));
		images.put('P', new Image(new File("res"+File.separator+"font"+File.separator+"p.png")));
		images.put('Q', new Image(new File("res"+File.separator+"font"+File.separator+"q.png")));
		images.put('R', new Image(new File("res"+File.separator+"font"+File.separator+"r.png")));
		images.put('S', new Image(new File("res"+File.separator+"font"+File.separator+"s.png")));
		images.put('T', new Image(new File("res"+File.separator+"font"+File.separator+"t.png")));
		images.put('U', new Image(new File("res"+File.separator+"font"+File.separator+"u.png")));
		images.put('V', new Image(new File("res"+File.separator+"font"+File.separator+"v.png")));
		images.put('W', new Image(new File("res"+File.separator+"font"+File.separator+"w.png")));
		images.put('X', new Image(new File("res"+File.separator+"font"+File.separator+"x.png")));
		images.put('Y', new Image(new File("res"+File.separator+"font"+File.separator+"y.png")));
		images.put('Z', new Image(new File("res"+File.separator+"font"+File.separator+"z.png")));
		images.put('0', new Image(new File("res"+File.separator+"font"+File.separator+"0.png")));
		images.put('1', new Image(new File("res"+File.separator+"font"+File.separator+"1.png")));
		images.put('2', new Image(new File("res"+File.separator+"font"+File.separator+"2.png")));
		images.put('3', new Image(new File("res"+File.separator+"font"+File.separator+"3.png")));
		images.put('4', new Image(new File("res"+File.separator+"font"+File.separator+"4.png")));
		images.put('5', new Image(new File("res"+File.separator+"font"+File.separator+"5.png")));
		images.put('6', new Image(new File("res"+File.separator+"font"+File.separator+"6.png")));
		images.put('7', new Image(new File("res"+File.separator+"font"+File.separator+"7.png")));
		images.put('8', new Image(new File("res"+File.separator+"font"+File.separator+"8.png")));
		images.put('9', new Image(new File("res"+File.separator+"font"+File.separator+"9.png")));
		images.put('/', new Image(new File("res"+File.separator+"font"+File.separator+"slash.png")));
		images.put('*', new Image(new File("res"+File.separator+"font"+File.separator+"asterisk.png")));
		images.put(':', new Image(new File("res"+File.separator+"font"+File.separator+"colon.png")));
		images.put('\"', new Image(new File("res"+File.separator+"font"+File.separator+"quotes.png")));
		images.put('+', new Image(new File("res"+File.separator+"font"+File.separator+"+.png")));
		images.put('-', new Image(new File("res"+File.separator+"font"+File.separator+"-.png")));
		images.put(';', new Image(new File("res"+File.separator+"font"+File.separator+";.png")));
		images.put('\'', new Image(new File("res"+File.separator+"font"+File.separator+"\'.png")));
		images.put('.', new Image(new File("res"+File.separator+"font"+File.separator+"..png")));
		images.put(',', new Image(new File("res"+File.separator+"font"+File.separator+",.png")));
	}
	public static Image getCharacterImage(char c) {
		System.out.println(c);
		System.out.println(images.get(c));
		return images.get(c);
	}
}
