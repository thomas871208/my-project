package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18? (Yes/No)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		//boolean adult = line.equals("Yes") || line.equals("yes");     bad
		boolean adult = line.equalsIgnoreCase("yes");
		/*if adult {
			System.out.println("welcome, what is your age?");
		}*/
	}

}
