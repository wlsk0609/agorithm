package com.bit.loop;

public class EvenSum {
	public static void main(String[] args) {
		String s = "";
		int t =0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				if(i<100) {
					s += i+"+";
				}else {
					s += i+"=";
				}
				t += i;
			}
		}
		System.out.print( s + t);
	}
}
