package dym.rpg.sound.staticSounds;

import java.io.File;

import dym.rpg.sound.Sound;

public class TestMusic extends Sound {

	public TestMusic() {
		super("res"+File.separator+"sound"+File.separator+"test.wav");
		this.getClip().setLoopPoints(50, 3000000);
	}

}
