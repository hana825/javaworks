package com.callor.arrays.exec;
/*
 * 수행과제
 ** 1~100까지 수를 덧셈하여 출력
 */
public class ExecV5 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		for(int i = 1; i <= 100; i++) {
			intSum += i;
		}
		System.out.println(intSum);
	}

}
