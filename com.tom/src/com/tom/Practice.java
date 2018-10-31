package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int secret = scanner.nextInt();	
		int real =(random.nextInt(100)+1);
		System.out.println(real);
		if (secret > real) {
			System.out.println("1~" + secret);
		}
		else  {
			System.out.println(secret + "~100");
			while(real != secret) {
			Scanner scanner2 = new Scanner(System.in);
			int secret1 = scanner.nextInt();
			if (secret1 > real) {
			System.out.println(secret +"~"+ secret1);
			}
			else {
				System.out.println(secret1 +"~"+secret);
			}
			}
			}
	
	//答案沒法隨著每次打而改變，sceret1一直都是同一個數，下次要用建構子試試
	//說不定用int a = 100 ， a = a-1的方法也行

}
}