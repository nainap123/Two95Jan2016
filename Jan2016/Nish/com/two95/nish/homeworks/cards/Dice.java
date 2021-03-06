package com.two95.nish.homeworks.cards;

import java.util.List;

public class Dice {
	private String color;
	private String suite;
	private List<String>value;
	public Dice(String color, String suite, List<String> value) {
		super();
		this.color = color;
		this.suite = suite;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Dice [color=" + color + ", suite=" + suite + ", value=" + value + "]";
	}
	
}
