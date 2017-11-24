package com.bit.opcode;

import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor =0,met =0,eng =0,ave =0;
		String name ="" ,cred ="" ;
		String[] arr = {
				"이름은?",
				"국어점수는?",
				"수학점수는?",
				"영어점수는?",
				"%s [평균] %d [학점] %s"
				
		};
		System.out.print(arr[0]);
		name = scanner.next();
		System.out.print(arr[1]);
		kor = scanner.nextInt();
		System.out.print(arr[2]);
		met = scanner.nextInt();
		System.out.print(arr[3]);
		eng = scanner.nextInt();
		ave = (kor +met +eng) /3;
		
		switch(ave/10) {
		case 10 : cred = "A";break;
		case 9 : cred = "B";break;
		case 8 : cred = "C";break;
		case 7 : cred = "D";break;
		default : cred = "F";break;
		}
		
		System.out.printf( arr[4] ,name,ave,cred);
	}
}
