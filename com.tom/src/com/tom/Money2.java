package com.tom;

import java.util.Scanner;

public class Money2 {

	public static void main(String[] args){
		
		
			Scanner scanner = new Scanner(System.in);
			double value = scanner.nextDouble();
			Money money = new Money(value);
	        System.out.println(money.NTD + "NTD = "+ money.USD() + "USD= " 
			+ money.JPY() + "JPY= " + money.EUR() + "EUR");
	}

}
