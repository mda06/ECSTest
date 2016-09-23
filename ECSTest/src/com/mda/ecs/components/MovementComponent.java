package com.mda.ecs.components;

import com.mda.ecs.core.Component;

public class MovementComponent extends Component {
	public float velX, velY;
	
	public MovementComponent() {
		velX = velY = 0;
	}
}
