package com.tom;

public class Student {
	String name;
	int english;
	int math;

	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2);
	}
}
//寫這隻程式好像才能讓Hello的分數部分順利執行，不知為何
//"\t"是空一段距離 "\n"是空一行