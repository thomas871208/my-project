package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Random random = new Random();
		int real =(random.nextInt(100)+1);
		System.out.println(real + "\t" + "�������ѡA�������i�S���׳�");
		System.out.println("Please guess a number between 1 to 100");
		int max = 100;
		int min = 1;
		while(true) { 
		Scanner scanner = new Scanner(System.in);
		int secret = scanner.nextInt();	
		
		if (secret == real) {
		System.out.println("Congratulation! �n��ܦn��A�����N�n�δ�");
		}
		else if (secret > real && secret <= 100) {
		System.out.println(min + "~" + secret);
		max = secret;
		//�̤j�ȳo�ˤ~�|�ܦ��W�������Ʀr
		}
		else if (secret < real && secret >= 1) {
			System.out.println(secret + "~" + max);
			min = secret;
		//�̤p�ȳo�ˤ~�|�ܦ��W�������Ʀr
			}
		
		else  {
				System.out.println("�S�@�Ӥ��|�ݤ��媺�媼");
			
			}
			}
			}
		    

	//���רS�k�H�ۨC�����ӧ��ܡAsceret1�@�����O�P�@�ӼơA�U���n�Ϋغc�l�ո�
	//�����w��int a = 100 �A a = a-1����k�]��
	//�غc�l�O���ӭp�⪺
	//�ĤG�طQ�k�O�諸�A�n�ηs�ƭȨ��N�¼ƭ�
}
