package com.callor.app.exec;
/*
 * 정수형 배열 10개를 선언하고
 * 1~100까지 임의의 정수를 생성하여 배열에 저장
 * 배열에 저장된 수 중 짝수의 개수와 짝수의 합을 구하여 출력
 */
public class Exec02 {
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		// 배열에 값을 채워 넣는 부분
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}
		
		// 연산하는 부분
		int count = 0;
		int sum = 0;
		for(int num : nums) {
			if(num % 2 == 0) {
				count++;
				sum += num;
			}
			
		}
		System.out.println("짝수의 개수 : " + count);
		System.out.println("짝수의 합 : " + sum);
	}

}
