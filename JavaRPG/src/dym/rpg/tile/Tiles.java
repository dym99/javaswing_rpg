package dym.rpg.tile;

import java.io.File;

import dym.rpg.graphics.Image;

public class Tiles {
	/*
	 * Hello! It's Jordan, and I'm going to explain the naming conventions.
	 * The Image is defined as a tile (texture) with the "tile_"
	 * The thing that follows is what the texture is of eg. "tile_computer_..."
	 * _x is what position the texture is meant to be used in. For example, _m is for the middle of an object.
	 * _d or _n is for the day (_d) and night (_n) versions of the texture.
	 */
	public static Image tile_grass1 = new Image(new File("res"+File.separator+"tiles"+File.separator+"grass1.png"));
	public static Image tile_rock = new Image(new File("res"+File.separator+"tiles"+File.separator+"rock.png"));
	public static Image tile_road_m_d = new Image(new File("res"+File.separator+"tiles"+File.separator+"road_m_D.png"));
	public static Image tile_roof_m_d = new Image(new File("res"+File.separator+"tiles"+File.separator+"roof_m_D.png"));
	public static Image tile_roof_m_n = new Image(new File("res"+File.separator+"tiles"+File.separator+"roof_m_N.png"));
	/*
	
	public static Image tile_ = new Image(new File("res"+File.separator+"tiles"+File.separator+".png"));
	public static Image tile_ = new Image(new File("res"+File.separator+"tiles"+File.separator+".png"));
	public static Image tile_ = new Image(new File("res"+File.separator+"tiles"+File.separator+".png"));
	public static Image tile_ = new Image(new File("res"+File.separator+"tiles"+File.separator+".png"));
	public static Image tile_ = new Image(new File("res"+File.separator+"tiles"+File.separator+".png"));
	public static Image tile_ = new Image(new File("res"+File.separator+"tiles"+File.separator+".png"));
	public static Image tile_ = new Image(new File("res"+File.separator+"tiles"+File.separator+".png"));
*/
}
