package com.bit.opcode;

import java.util.Scanner;

public class CaicSwich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String opcode = "", test ="";
		boolean inputok = true;
		String[] arr = new String[4]; //책꽂이 역활
		arr[0] = "첫번째 숫자를 입력하세요!\n";
		arr[1] = "연산 기호를 입력하세요!\n";
		arr[2] = "두번째 숫자를 입력하세요!\n";
		arr[3] = "잘못된 입력입니다!";
		arr[4] = "%d %s %d = %d ";
		int num1 = 0, num2 = 0, result =0;
		System.out.print(arr[0]);
		num1 = scanner.nextInt();
		System.out.print(arr[1]);
		opcode = scanner.next();
		System.out.print(arr[2]);
		num2 = scanner.nextInt();
		
		switch(opcode){
		case "+" : result = num1 + num2;break;
		case "-" : result = num1 - num2;break;
		case "*" : result = num1 * num2;break;
		case "/" : result = num1 / num2;break;
		default:
			inputok = false;
			break;
			
		
		}if(!inputok) {
			test = arr[3];
		}else {
			test = String.format (arr[4],num1, opcode, num2, result);
			//System.out.println("5 + 3 = 8");
		//System.out.printf("%d %s %d = %d ",num1, opcode, num2, result);
			}
		System.out.print(test);
	}
}