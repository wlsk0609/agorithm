package com.bit.opcode;

import java.util.Scanner;

public class WhoAreYou {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		String age= "";
		String[] arr = {
				"당신의 이름은?\n",
				"나의 이름은 %s 입니다.\n",
				"당신의 나이는?\n",
				 " %s  입니다\n"
				
		};
		
		System.out.print(arr[0]);
		name = s.next();
		System.out.printf(arr[1],name);
		System.out.print(arr[2]);
		age = s.next();
		System.out.printf(arr[3],age);
		
	}
}
