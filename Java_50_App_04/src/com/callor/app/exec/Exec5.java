package com.callor.app.exec;

import java.util.List;

import com.callor.app.GetValue;

public class Exec5 {
	/*
	 * 정수형 리스트를 생성하고 1~100까지의 임의의 정수 100개를 생성하여 추가
	 * 리스트에 담긴 정수들 중 55 이상의 정수가 "가장 큰 값"이 나타나는 위치와 값을 함께 출력
	 */
	public static void main(String[] args) {
		List<Integer> nums = GetValue.getList(100);
		
		int lastIndex = 0;
		int max = 0;
		for(int i = 0; i < nums.size(); i++) {
			int num = nums.get(i);
			if(num > max) {
				max = num;
				lastIndex = i;
			}
		}
		System.out.printf("%3d : %3d\n", lastIndex, max);
		// max 값과 일치하는 최초의 요소 위치를 알려주는 method
		int index = nums.indexOf(max);
		System.out.println("가장 큰 수가 가장 처음 나타난 위치 : " + index);
		
	}

}
