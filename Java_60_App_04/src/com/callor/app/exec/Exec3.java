package com.callor.app.exec;
/*
 * 수행과제
 * 1. 정수형 배열 10개를 선언하고
 * 2. 1 ~ 100까지 임의의 정수를 생성하여 배열에 저장
 * 3. 배열의 리스트를 보여주고
 * 4. 배열에 저장된 정수들의 합을 구하여 console에 출력
 * 5. 배열에 저장된 정수들의 평균값을 구하여 console에 출력
 * 
 * 선생님 풀이 : 선생님 깃허브에서 App01.java 보기
 */
public class Exec3 {
	public static void main(String[] args) {
		
		int sum = 0;
		float avg = 0;
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i ++) {
			int num = (int)(Math.random() * 100) + 1;
			nums[i] = num;
		}
		for(int num : nums) {
			System.out.printf("%d\t", num);
		}
		for(int num : nums) {
			sum += num;
		}
		avg = (float) sum / nums.length;
		
		System.out.println();
		System.out.printf("정수의 합 : %d\n", sum);
		System.out.printf("평균 값 : %.2f", avg);
	}

}
