package com.mda.ecs.systems;

import com.mda.ecs.components.MovementComponent;
import com.mda.ecs.components.PositionComponent;
import com.mda.ecs.core.BaseSystem;
import com.mda.ecs.core.Entity;

public class MovementSystem extends BaseSystem {
	private PositionComponent pc;
	private MovementComponent mc;
	
	public void update(float dt, Entity e) {
		pc = e.getAs(PositionComponent.class);
		mc = e.getAs(MovementComponent.class);
		if(pc == null || mc == null) return;
		
		pc.x += mc.velX * dt;
		pc.y += mc.velY * dt;
		pc.degrees += dt;
	}
}
