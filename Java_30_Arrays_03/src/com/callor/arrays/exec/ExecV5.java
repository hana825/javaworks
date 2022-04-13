package com.callor.arrays.exec;
/*
 * 수행과제
 ** 1~100까지 수를 덧셈하여 출력
 */
public class ExecV5 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		for(int i = 0; i < 100; i++) {
			// 내부에서 원하는 값에 대한 연산을 해주는 것이 좋다!
			intSum += (i + 1);
		}
		System.out.println(intSum);
	}

}
