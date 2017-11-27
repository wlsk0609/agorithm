package com.bit.loop;
///1~100 까지 홀수의 합
/// modular %
/// 1 % 2 = 1
/// 2 % 2 = 0
/// 3 % 2 = 1
/// 4 % 2 = 0
public class OddSum {
	public static void main(String[] args) {
		/// 1 + 3 + 5 + ... + 99 = ?
		String a = "";
		int t = 0;
		for(int i=1;i<=99;i++) { // i++ -> i += 1 -> i = i + 1
			
			if(i%2==1) {
				if(i<99) {
					a += i+"+";
				}else{
					a += i+"=";
				}
				t += i;
			}else {
			
			}
		}
		System.out.print(a + t);
	}
}
