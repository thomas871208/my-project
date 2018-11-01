package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Random random = new Random();
		int real =(random.nextInt(100)+1);
		System.out.println(real + "\t" + "此為正解，正式版可沒答案喔");
		System.out.println("Please guess a number between 1 to 100");
		int max = 100;
		int min = 1;
		while(true) { 
		Scanner scanner = new Scanner(System.in);
		int secret = scanner.nextInt();	
		
		if (secret == real) {
		System.out.println("Congratulation! 好喔很好喔，阿不就好棒棒");
		}
		else if (secret > real && secret <= 100) {
		System.out.println(min + "~" + secret);
		max = secret;
		//最大值這樣才會變成上次打的數字
		}
		else if (secret < real && secret >= 1) {
			System.out.println(secret + "~" + max);
			min = secret;
		//最小值這樣才會變成上次打的數字
			}
		
		else  {
				System.out.println("又一個不會看中文的文盲");
			
			}
			}
			}
		    

	//答案沒法隨著每次打而改變，sceret1一直都是同一個數，下次要用建構子試試
	//說不定用int a = 100 ， a = a-1的方法也行
	//建構子是拿來計算的
	//第二種想法是對的，要用新數值取代舊數值
}
