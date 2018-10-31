package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.println("please write a number between -3~5");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println( number >=-3 && number<=5 );
	}

}
//靠自己打對程式很開心