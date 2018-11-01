package com.tom;

public class Person {
	String name;
	float weight;
	float height;
	
	public Person(float weight, float height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public void hello() {
		System.out.println("Hello");
	}
	//這個方法可以用建構子說話
	
	public float bmi() {
		float bmi = weight/(height*height);
		return bmi;
	}
}

//建構子不會，好像要在Hello打什麼和註解什麼