package com.bit.opcode;

import java.util.Scanner;

public class Caic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = {
				"+","-","*","/","%",
				"첫번째 숫자 입력",
				"두번째 숫자 입력",
				"연산자를 입력하세요!  + 더하기 , - 빼기 , * 곱하기 , / 나누기  "
		};
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "";
		System.out.println(arr[5]);
		num1 = scanner.nextInt();
		System.out.println(arr[7]);
		opcode = scanner.next();
		System.out.println(arr[6]);
		num2 = scanner.nextInt();
		if(opcode.equals(arr[0])) {
			result = num1 + num2;
		}else if(opcode.equals(arr[1])){
			result = num1 - num2;
		}else if(opcode.equals(arr[2])){
			result = num1 * num2;
		}else if(opcode.equals(arr[3])){
			result = num1 / num2;
		}else if(opcode.equals(arr[4])){
			result = num1 % num2;
		}
		
			System.out.printf( "%d  %s  %d = %d", num1, opcode, num2, result) ;
	}
}
