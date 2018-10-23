package com.tom;

import java.util.*;

public class Hello {

	public static void main(String[] args) {
		/*
		 * int age=19; float weight = 65.6f; short number = 19; age = number;
		 * float height = 1.7f; float bmi = weight/(height*height);
		 * System.out.println (weight); System.out.println (age);
		 * System.out.println (height); System.out.println (bmi);
		 */
		/*
		 * String name = "TTS"; int english = 70; int math = 90;
		 * System.out.println(name+"\t"+english+"\t"+math+"\t"+(english+math)/2)
		 * ;
		 */
		Student stu = new Student();
		stu.name = "TTS";
		stu.english = 70;
		stu.math = 90;
		stu.print();

		System.out.println(3 <= 5);
		
		
		/*Person person1 = new Person();
		person1.name = "TTS";
		person1.weight = 66.6f;
		person1.height = 1.7f;*/
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
	}

}
