package com.callor.controller;

public class Method_01 {
	
	/***********************************************************************************************
	 *  수행과제!
	 ** num()를 선언하고 1~100까지 범위의 임의의 정수 2개를 만든 후 두 수를 덧셈하여 결과를 return
	 ** main()에서 num()를 호출하여 결과를 변수에 담고 변수의 값을 console에 출력
	 ***********************************************************************************************/
	public static void main(String[] args) {
		
		int intResult = num();
		System.out.println(intResult);
		
	}
	public static int num()	{
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		
		return intNum1 + intNum2 ;
		
	}
	
}
