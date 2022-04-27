package com.callor.app.exec;

public class Exec7 {

	/*
	 * 정수형 배열 선언하고 각 요소에 2~101까지의 임의의 정수 저장 각 배열 요소에 담긴 정수 중 소수의 개수를 세어 출력
	 */

	public static void main(String[] args) {

		int[] intNums = new int[100];
		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			int num = intNums[i];
			num = (int) (Math.random() * 100) + 2;
			count += isPrime(num);
		}
		System.out.println("소수의 개수: " + count);
		
	}
	

	public static int isPrime(int num) {
		if (num < 2) {
			return 0;
		}
		if (num == 2) {
			return 1;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}
