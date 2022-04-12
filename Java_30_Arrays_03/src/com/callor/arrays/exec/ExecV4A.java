package com.callor.arrays.exec;
/*
 * 수행과제
 ** 정수형 배열 100개를 선언하고
 ** Math.random()를 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저장
 ** 배열의 각 요소에 저장된 수 중에서 "짝수 만을 모두 더하여" 결과를 출력하시오.
 */
public class ExecV4A {
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		for(int i = 0; i < intNums.length; i ++) {
			intNums[i] = (int)(Math.random()* 100) + 1;
		}
		
		// 짝수인 수를 덧셈할 변수를 선언
		int intEvenSum = 0;
		for(int i = 0; i < intNums.length; i ++) {
			boolean bEven = intNums[i] % 2 == 0;
			if(bEven) {
				// intEvenSum = intEvenSum + intNums[i];
				intEvenSum += intNums[i];
			}
		}
		System.out.println("짝수들의 합 : " + intEvenSum);
	}

}
