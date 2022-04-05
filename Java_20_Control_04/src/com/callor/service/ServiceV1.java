package com.callor.service;

public class ServiceV1 {
	
	/*
	 * void type method를 guguDan이름으로 선언하기
	 * void type method는 return 명령이 없어도 된다.
	 */
	public void guguDan() {
		int intNum = 3;
		int intDan = 1;
		
		System.out.println("구구단 3단");
		System.out.println("=================");
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.printf("%d x %d = %d\n" , intNum, intDan, intNum * intDan++);
		System.out.println("=================");
	}

}
