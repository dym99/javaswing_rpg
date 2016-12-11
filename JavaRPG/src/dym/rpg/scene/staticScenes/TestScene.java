package dym.rpg.scene.staticScenes;

import dym.rpg.graphics.shading.Light;
import dym.rpg.physics.Collision;
import dym.rpg.physics.CollisionMap.CollisionType;
import dym.rpg.physics.Vector2;
import dym.rpg.scene.Scene;
import dym.rpg.tile.Tile;
import dym.rpg.tile.Tiles;

public class TestScene extends Scene {
	public TestScene() {
		super(false,DARK);
		///
		///collisions
		///
		
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 16, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 32, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 48, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 64, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 80, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 96, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 0));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 16));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 32));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 48));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 64));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 80));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 96));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 0, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 16, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 32, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 48, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 64, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 80, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 96, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 112));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 16));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 32));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 48));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 64));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 80));
		collisionMap.collisions.add(new Collision(CollisionType.SOLID, 112, 96));
		
		///
		///Tiles
		///
		tileMap.backTiles.add(new Tile(new Vector2(0,0), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(16,0), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,0), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,0), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,0), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,0), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,0), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(112,0), Tiles.tile_grass1));
		
		tileMap.backTiles.add(new Tile(new Vector2(0,0), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(16,0), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(32,0), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(48,0), Tiles.tile_lamp_base));
		tileMap.backTiles.add(new Tile(new Vector2(48,-16), Tiles.tile_lamp_post));
		tileMap.backTiles.add(new Tile(new Vector2(48,-32), Tiles.tile_lamp));
		tileMap.backTiles.add(new Tile(new Vector2(64,0), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(80,0), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(96,0), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(112,0), Tiles.tile_boulder_brown));


		tileMap.backTiles.add(new Tile(new Vector2(0,112), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(16,112), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,112), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,112), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,112), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,112), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,112), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(112,112), Tiles.tile_grass1));
		
		tileMap.backTiles.add(new Tile(new Vector2(0,112), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(16,112), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(32,112), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(48,112), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(64,112), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(80,112), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(96,112), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(112,112), Tiles.tile_boulder_brown));

		tileMap.backTiles.add(new Tile(new Vector2(0,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(0,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(0,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(0,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(0,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(0,96), Tiles.tile_grass1));
		
		tileMap.backTiles.add(new Tile(new Vector2(0,16), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(0,32), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(0,48), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(0,64), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(0,80), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(0,96), Tiles.tile_boulder_brown));

		tileMap.backTiles.add(new Tile(new Vector2(112,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(112,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(112,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(112,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(112,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(112,96), Tiles.tile_grass1));
		
		tileMap.backTiles.add(new Tile(new Vector2(112,16), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(112,32), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(112,48), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(112,64), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(112,80), Tiles.tile_boulder_brown));
		tileMap.backTiles.add(new Tile(new Vector2(112,96), Tiles.tile_boulder_brown));

		tileMap.backTiles.add(new Tile(new Vector2(16,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,16), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(16,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,32), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(16,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,48), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(16,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,64), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(16,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,80), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(16,96), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(32,96), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(48,96), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(64,96), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(80,96), Tiles.tile_grass1));
		tileMap.backTiles.add(new Tile(new Vector2(96,96), Tiles.tile_grass1));
		
		///
		///Entities
		///
		
		
		
		///
		///Lights
		///
		lights.add(new Light(new Vector2(48,-32),40.0F));
	}
}
