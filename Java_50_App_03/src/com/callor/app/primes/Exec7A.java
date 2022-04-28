package com.callor.app.primes;

public class Exec7A {

	/*
	 * 정수형 배열 선언하고 각 요소에 2~101까지의 임의의 정수 저장 각 배열 요소에 담긴 정수 중 소수의 개수를 세어 출력
	 */

	public static void main(String[] args) {

		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 2;
			nums[i] = num;
		}
		int count = 0;
		// 배열 전체 요소 개수만큼 반복하기
		for (int i = 0; i < nums.length; i++) {
			
			// 배열의 i번째 요소에 저장된 수가 소수인가 판별
			int index = 0;
			for (index = 2; index < nums[i]; index++) {
				if (nums[i] % index == 0) {
					break;
				}
			}
			// 배열의 i번째 요소가 소수이면 count 증가
			if (!(index < nums[i])) {

			} else {
				count++;
			}
		}
		System.out.println("소수의 개수 : " + count);
	}

}
