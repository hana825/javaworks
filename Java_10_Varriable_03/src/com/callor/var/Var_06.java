package com.callor.var;

public class Var_06 {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		
//		변수++ 또는 ++변수
//		: 단독으로 사용될 때는 연산 결과가 똑같다.
//		ex)	++num1;
//			num1++;
//			
//		하지만, 다른 명령문 안에서 사용될 때는 성질이 매우 달라서 많이 주의를 해야한다.
//		++변수 : 가장 먼저 실행되는 명령이 된다.
//		변수++ : 모든 명령이 다 실행되고 다음 줄 명령문으로 진행하기 직전에 실행된다.
		
	
		System.out.println(++num1);		// ++가 앞에 붙어있는 경우 제일 먼저 작동
		System.out.println(num1++);		// ++가 뒤에 붙어있는 경우 가장 마지막에 작동
		// num1이 1인 상태에서 출력을 하고, ++를 실행해서 그 다음 출력문에 2를 출력한다.
		System.out.println(num1);
		
		System.out.println("========================");
		
		num1 = 0;
		num1 = ++num1 * 3;
		System.out.println(num1);
		
		num1 = 0;
		num1 = num1++ * 3;
		System.out.println(num1);			// Debug를 위한 코드
		
		
		
		
	}

}
