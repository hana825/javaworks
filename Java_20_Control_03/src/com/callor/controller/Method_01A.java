package com.callor.controller;

public class Method_01A {
	
	/***********************************************************************************************
	 *  수행과제 답
	 ** num()를 선언하고 1~100까지 범위의 임의의 정수 2개를 만든 후 두 수를 덧셈하여 결과를 return
	 ** main()에서 num()를 호출하여 결과를 변수에 담고 변수의 값을 console에 출력
	 ***********************************************************************************************/
	public static void main(String[] args) {
		// num()를 호출하여(실행하고) return된 값을 intResult에 저장하기
		int intResult = num();
		System.out.println(intResult);
		
	}
	
	// int num() { } : 어떤 정수 값을 return 하겠다.
	public static int num()	{
		// 임의의 정수 2개를 만들고(변수에 저장하고)
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;

		// 두 값을 덧셈하여 return
		return intNum1 + intNum2 ;
		
	}
	
}
