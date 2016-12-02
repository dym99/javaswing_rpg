package dym.rpg.scene;

import dym.rpg.scene.staticScenes.SettingsScreen;
import dym.rpg.scene.staticScenes.TestScene;
import dym.rpg.scene.staticScenes.TestScene2;

public class SceneManager {
	public static TestScene testScene1 = new TestScene();
	public static TestScene2 testScene2 = new TestScene2();
	public static SettingsScreen settings = new SettingsScreen();
	
	public static Scene currentScene = testScene1;
	public static Scene prevScene = currentScene;
	public static void gotoScene(Scene s) {
		prevScene = currentScene;
		currentScene = s;
	}
	public static void gotoPrev() {
		currentScene = prevScene;
	}
}
