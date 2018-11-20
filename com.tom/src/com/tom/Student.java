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
		System.out.print(name + "\t" + english + "\t" + math + "\t" + average()+ "\t" 
	     + highest()+ "\t" + getGrading() + "\t" + (average()<60? "FAILED" : "PASS"));
		//���� ? "(true)" : (false)
		//����U�����@��
		/*if (average() <60){
			System.out.println("FAIL"); 
		}
			else {
				System.out.println("PASS");
			}*/
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
	public char getGrading(){
		char grading = 'F';
		switch (average()/10) {
		case 10:
		case 9:
			grading = 'A';
			break;
		case 8:
			grading = 'B';
			break;
		case 7:
			grading = 'C';
			break;
		case 6:
			grading = 'D';
			break;
		default:
			grading = 'F';
			break;
		}
			return grading;
		
	}
	
}
//�g�o���{���n���~����Hello�����Ƴ������Q����A��������
//"\t"�O�Ť@�q�Z�� "\n"�O�Ť@��