package dym.rpg.scene;

import dym.rpg.scene.staticScenes.MenuUI;
import dym.rpg.scene.staticScenes.TestScene;
import dym.rpg.scene.staticScenes.TestScene2;

public class SceneManager {
	public static MenuUI menu = new MenuUI();
	public static TestScene testScene1 = new TestScene();
	public static TestScene2 testScene2 = new TestScene2();
	
	public static Scene currentScene = menu;
}
