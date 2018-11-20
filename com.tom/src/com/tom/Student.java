package com.tom;

import java.lang.invoke.SwitchPoint;

public class Student {
	String name;
	int english;
	int math;
	
	public Student (String name,int english,int math){
		this.name = name;
		this.english = english;
		this.math = math;
		
	}

	public void print() {
		System.out.print(name + "\t" + english + "\t" + math + "\t" + average()+ "\t" + highest());
		if (average() <60){
			System.out.println("FAIL");
		}
			else {
				System.out.println("PASS");
			}
	}
	
	public int average(){
	return (english + math)/2;
	}
	
	public int highest(){
		 if (english > math){
			 System.out.println(english);
		 }
		 else {
			System.out.println(math);
		}
		 return average();
	}
	/*public char getAverage(){
		average() = getAverage();
		char grading = 'F';
		switch (average()) {
		case :
			
			break;

		default:
			break;
		}
	}*/
	
}
//寫這隻程式好像才能讓Hello的分數部分順利執行，不知為何
//"\t"是空一段距離 "\n"是空一行