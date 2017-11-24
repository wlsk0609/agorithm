package com.bit.opcode;

import java.util.Scanner;

public class WhoAreYou {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		String age= "";
		String[] arr = new String[4];
		arr [0] ="당신의 이름은?\n";
		arr [1] =String.format("나의 이름은 %s 입니다.\n");
		arr [2] ="당신의 나이는?\n";
		arr [3] =String.format( " %s  입니다\n");
		System.out.print(arr[0]);
		name = s.next();
		System.out.printf(arr[1],name);
		System.out.print(arr[2]);
		age = s.next();
		System.out.printf(arr[3],age);
		
	}
}
