package com.mda.ecs.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Engine {
	private HashMap<Class<?>, BaseSystem> systems;

	public Engine() {
		systems = new HashMap<Class<?>, BaseSystem>();
	}

	public void addSystem(BaseSystem bs) {
		systems.put(bs.getClass(), bs);
	}

	public void removeSystem(Class<?> type) {
		systems.remove(type);
	}

	@SuppressWarnings("unchecked")
	public <T extends BaseSystem> T getSystem(Class<T> classType) {
		return (T) systems.get(classType);
	}

	public void run() {
		EntitySystem es = getSystem(EntitySystem.class);
		if (es == null)
			throw new Error("No EntitySystem was found in the Engine. Add a EntitySystem to the Engine.");
		for (int i = 0; i < 10; i++) {
			for (Entity entity : es.getEntities()) {
				Iterator<Entry<Class<?>, BaseSystem>> it = systems.entrySet().iterator();
				while (it.hasNext()) {
					Entry<Class<?>, BaseSystem> pair = it.next();
					pair.getValue().update(i, entity);
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
