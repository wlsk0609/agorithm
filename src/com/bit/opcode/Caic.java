package com.bit.opcode;

import java.util.Scanner;

public class Caic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[5];
		arr [0] = "첫번째 숫자 입력";
		arr [1] = "두번째 숫자 입력";
		arr [2] = " 연산자를 입력하세요!  + 더하기 , - 빼기 , * 곱하기 , / 나누기  ";
		arr [3] = "/";
		arr [4] = "%";
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "";
		System.out.println(arr[0]);
		num1 = scanner.nextInt();
		System.out.println(arr[1]);
		num2 = scanner.nextInt();
		System.out.println(arr[2]);
		opcode = scanner.next();
		if(opcode.equals(arr[0])) {
			result = num1 + num2;
		}else if(opcode.equals(arr[1])){
			result = num1 - num2;
		}else if(opcode.equals(arr[2])){
			result = num1 * num2;
		}else if(opcode.equals(arr[3])){
			result = num1 / num2;
		}else if(opcode.equals(arr[4])) {
			
		}
		
			System.out.println( num1 + " " + opcode + " " + num2 + " =  " + result + " 입니다! " );
	}
}
