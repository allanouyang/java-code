package com.ouyang.enums;

import java.util.HashMap;
import java.util.Map;

public enum Color {

	RED, GREEN, BLUE;
	static final Map<String, Color> mapColor = new HashMap<String, Color>();
	static {
		for(Color c : Color.values()) {
			mapColor.put(c.toString(), c);
		}
	}
	Color() {
//		mapColor.put(toString(), this);	//此种会编译错误，由于mapColor还未调用。 Color.RED在前
	}
}
