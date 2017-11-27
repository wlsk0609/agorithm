package com.bit.opcode;
/*
고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만
bmi
if(18.5 <= bmi && bmi < 22.9)
 * */
import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String res1 ="";
	for(int i=0;i<3;i++) {
		String name = "",res="";
		double weight= 0.0, size=0.0, bmi=0.0;
		System.out.print("이름을 입력하세요\n");
		name = s.next();
		System.out.print("키를 입력하세요\n");
		size = s.nextDouble()/100;
		System.out.print("몸무게를 입력하세요\n");
		weight = s.nextDouble();
		bmi = weight /(size*size);
	
		if(18.5>bmi) {
			res = "저체중 입니다\n";
		}else if(18.5<=bmi&&bmi<22.9) {
			res = "정상 입니다.\n";
		}else if(23<=bmi&&bmi<24.9){
			res = "과체중 입니다\n";
		}else if(25<=bmi&&bmi<30){
			res = "경도 비만 입니다\n";
		}else if(30<=bmi&&bmi<35){
			res = "중등도 비만 입니다\n";
		}else if(35<bmi){
			res = "고도 비만입니다\n";
		}
		res += String.format("%d + 님은 + %d",name,res );
	 }
	 System.out.print(res1);
	}
}
