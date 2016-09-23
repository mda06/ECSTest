package com.mda.ecs.core;

import java.util.ArrayList;
import java.util.List;

public class EntitySystem extends BaseSystem {
	private int currentAvailableID;
	private List<Entity> entities;

	public EntitySystem() {
		currentAvailableID = 0;
		entities = new ArrayList<Entity>();
		if (Entity.entitySystem == null)
			Entity.entitySystem = this;
	}

	private int getNextAvailableID() {
		return currentAvailableID++;
	}

	protected void registerEntity(Entity e) {
		if (e == null)
			throw new Error("Entity is null. Cannot register entity.");

		e.setID(getNextAvailableID());
		entities.add(e);
	}

	public Entity getEntity(int id) {
		if (id == -1)
			return null;

		for (Entity e : entities)
			if (e.getID() == id)
				return e;

		return null;
	}

	public void removeEntity(Entity e) {
		if (e == null)
			return;

		entities.remove(e);
	}
	
	public List<Entity> getEntities() {
		return entities;
	}

	@Override
	public void update(float dt, Entity e) {}
}
