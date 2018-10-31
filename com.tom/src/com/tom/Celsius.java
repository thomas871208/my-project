package com.tom;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		System.out.println("Please write down a number for Celsius, I will change it to Fahrenheit");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		double f = c*(9.0/5.0)+32;
		System.out.printf("%.2fC = %.2fF",c,f);
		
		
	}

}
//溫度轉換計，做出來很開心，但不會用建構子做