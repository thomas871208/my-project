package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		System.out.println("Please guess a number between 1 ~ 10");
		Random random = new Random();
		int real = (random.nextInt(10)+1);
		System.out.println(real);
		
		
		int count = 0;
		while(count < 4){
			count = count +1;
			Scanner scanner = new Scanner(System.in);
		int secret = scanner.nextInt();
			if(secret > real){
				System.out.println("Your guess is: " + secret);
				System.out.println("lower (" + count +"/4)" );
			}
			else if (secret < real) {
				    System.out.println("Your guess is: " + secret);
					System.out.println("higher (" + count + "/4)");
				}
		
			else {
				if(count<3){
					System.out.println("Exllent! the real numebr is :" + real);
					break;
				}
				
				else {
					System.out.println("Great! the real numebr is :" + real);
						break;
				}
					
			}
			if(real != secret && count == 4 ) {
					System.out.println("Are you stupid?");
					break;
		}
			else if(count == 4) {
				break;
			}
		}	
	}

}
	