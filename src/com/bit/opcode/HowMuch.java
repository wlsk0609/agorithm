package com.bit.opcode;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money= 0,num =0,totalMoney= 0,ave =0,per =0,sum =0;
		String[] arr = {
				"얼마예요?\n",
				"%d 원 입니다.\n",
				"몇개 드릴까요?\n",
				"총 금액은 %d 원 입니다\n",
				"비싸요 깍아주세요!\n", 
				"몇 퍼센트 DC 할까요?\n",
				" %d 원 입니다.\n", 
				"안 팔아요\n" 
		};
		
		System.out.print(arr[0]);
		money = scanner.nextInt();
		System.out.printf(arr[1],money);
		System.out.printf(arr[2]);
		num = scanner.nextInt();
		totalMoney = num * money ;
		System.out.printf( arr[3],totalMoney );
		System.out.print(arr[4]);
		System.out.print(arr[5]);
		per = scanner.nextInt();		
		
		if(per<10) {
			 sum = totalMoney -(totalMoney/100*per) ;
			 System.out.printf(arr[6],sum);
		}else 
			System.out.print(arr[7]);
		}
		
	}
