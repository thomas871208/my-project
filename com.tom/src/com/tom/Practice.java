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
	
	//���רS�k�H�ۨC�����ӧ��ܡAsceret1�@�����O�P�@�ӼơA�U���n�Ϋغc�l�ո�
	//�����w��int a = 100 �A a = a-1����k�]��

}
}