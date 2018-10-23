package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18? (Yes/No)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		//boolean adult = line.equals("Yes") || line.equals("yes");     bad
		boolean adult = line.equalsIgnoreCase("yes");
		if (adult) {
			System.out.println("welcome, what is your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("what is your name?");
			String name = scanner.nextLine();
			System.out.println("what is your nickname?");
			String nickname = scanner.nextLine();
			System.out.println("This is your personal information");
			System.out.println( age+"/"+name+"/"+nickname);
		}
		else{
			System.out.println("Poor kid, thank you for your using, see ya!");
		}
		}
	}


