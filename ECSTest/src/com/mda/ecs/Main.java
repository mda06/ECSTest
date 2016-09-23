package com.mda.ecs;

import com.mda.ecs.components.MovementComponent;
import com.mda.ecs.components.PositionComponent;
import com.mda.ecs.components.RenderComponent;
import com.mda.ecs.core.Engine;
import com.mda.ecs.core.Entity;
import com.mda.ecs.core.EntitySystem;
import com.mda.ecs.systems.MovementSystem;
import com.mda.ecs.systems.RenderSystem;

public class Main {
	public static void main(String args[]) {
		Engine engine;
		
		engine = new Engine();
		engine.addSystem(new EntitySystem());
		System.out.println("Before : " + engine.getSystem(EntitySystem.class).getEntities().size());
		new Entity();
		System.out.println("After : " + engine.getSystem(EntitySystem.class).getEntities().size());
		
		/*Engine engine = new Engine();
		engine.addSystem(new EntitySystem());
		engine.addSystem(new RenderSystem());
		engine.addSystem(new MovementSystem());
		
		Entity e = new Entity();
		e.addComponent(new PositionComponent(5, 5)).addComponent(new RenderComponent("MDA")).addComponent(new MovementComponent());
		e.getAs(MovementComponent.class).velX = 3;
		e.getAs(MovementComponent.class).velY = 1.5f;
		
		Entity e2 = new Entity();
		e2.addComponent(new PositionComponent(50, 8)).addComponent(new RenderComponent("Momo")).addComponent(new MovementComponent());
		e2.getAs(MovementComponent.class).velX = 2.5f;
		
		engine.run();
		engine.removeSystem(MovementSystem.class);
		engine.getSystem(EntitySystem.class).getEntity(e.getID()).getAs(RenderComponent.class).name = "Noooo";
		engine.run();*/
	}
}
