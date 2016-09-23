package com.mda.ecs.systems;

import com.mda.ecs.components.PositionComponent;
import com.mda.ecs.components.RenderComponent;
import com.mda.ecs.core.BaseSystem;
import com.mda.ecs.core.Entity;

public class RenderSystem extends BaseSystem {
	private PositionComponent pc;
	private RenderComponent render;
	
	public void update(float dt, Entity e) {
		pc = e.getAs(PositionComponent.class);
		render = e.getAs(RenderComponent.class);
		if(pc == null || render == null) return;
		
		System.out.println(render.name + " is at " + pc.x + "/" + pc.y + " with angle of " + pc.degrees + " °");
	}
}