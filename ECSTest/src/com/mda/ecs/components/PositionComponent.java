package com.mda.ecs.components;

import com.mda.ecs.core.Component;

public class PositionComponent extends Component {
	public float x, y;
	public float degrees;
	
	public PositionComponent(float x, float y) {
		this.x = x;
		this.y = y;
		degrees = 0;
	}
}