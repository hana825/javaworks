package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		// 변수에 값 저장하기
		// 변수에 어떤 값을 저장하면 이미 저장된 값은 사라진다
		intNum1 = 33;
		intNum2 = 55;
		
		// 사칙연산 결과를 저장(보관)하기 위한 변수 선언 clear
		int intSum = 0;
		int intMin = 0;
		int intMulti = 0;
		int intDiv = 0;
		
		// intNum1, intNum2 변수에 담김 값을 읽어와서 사칙연산을 수행한 후 각각의 변수에 저장하기
		// 변수에 담긴 값을 읽어서 연산을 수행한 후 다른 변수에 저장하기
		intSum = intNum1 + intNum2;
		intMin = intNum1 - intNum2;
		intMulti = intNum1 * intNum2;
		intDiv = intNum1 / intNum2;
		
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2, intMin);
		System.out.printf("%d x %d = %d\n", intNum1, intNum2, intMulti);
		System.out.printf("%d ÷ %d = %d\n", intNum1, intNum2, intDiv);
		
	}
}
