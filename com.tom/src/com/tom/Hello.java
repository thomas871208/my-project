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
		
		Random random = new Random();
		int number =  (random.nextInt(100)+1);
		System.out.println(number);
		
		/*while () {
			
		}
		是迴圈方法*/
		
		Scanner scanner = new Scanner(System.in);
		int secret = scanner.nextInt();	
		int real =(random.nextInt(100)+1);
		if (secret > real) {
			System.out.println("1~" + secret);
		}
		else  {
			System.out.println(secret + "~100");
		}
			//猜數子後繼續	
		Scanner scanner1 = new Scanner(System.in);
		String name = scanner1.nextLine();
		System.out.println("your name is"+ name);
		//打名子後繼續
		
		int n = 3/50;
		int k = (int)(3/5);
		int m = 5%3;
		System.out.println(n);
		System.out.println(k);
		System.out.println(m);
		String name1 = "TTS";
		int age1 = 20;
		System.out.printf("Hello, %s, your age is %d"+"\n", name1, age1 );
		System.out.println(4.0/3.0);
		System.out.printf( "%.5f"+"\n" ,4.0/3.0);
		//.5是四捨五入到第五位
		
		double c = 24;
		System.out.println(c*(9.0/5.0)+32);
	}

}
