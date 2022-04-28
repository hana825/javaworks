package com.callor.app.exec;

public class Exec1 {
	/*
	 * 정수형 배열 100개를 선언하고, 각 요소에 1~100까지의 임의의 정수 저장
	 * 각 배열 요소에 담긴 정수 중 55 이상의 정수들 리스트 전체 출력
	 */
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100)+ 1;
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= 55) {
				System.out.println(nums[i]);
			}
		}
		for(int num : nums) {
			if(num >= 55) {
				System.out.println(num);
			}
		}
		
	}


}
