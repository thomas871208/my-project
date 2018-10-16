package com.tom;

public class Student {
	String name;
	int english;
	int math;

	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2);
	}
}