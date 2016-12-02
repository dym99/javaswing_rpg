package dym.rpg.scene.staticScenes;

import dym.rpg.entities.ui.SettingsScreenHandler;
import dym.rpg.scene.Scene;

public class SettingsScreen extends Scene {
	public SettingsScreen() {
		super(true);
		this.entities.add(new SettingsScreenHandler());
	}
}
