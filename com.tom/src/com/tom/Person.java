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
	//�o�Ӥ�k�i�H�Ϋغc�l����
	
	public float bmi() {
		float bmi = weight/(height*height);
		return bmi;
	}
}

//�غc�l���|�A�n���n�bHello������M���Ѥ���