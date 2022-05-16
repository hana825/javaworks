package com.callor.app.exec;

public class Exec07 {
	public static void main(String[] args) {
		int dan = 7;
		int result = 0;
		System.out.println("=".repeat(20));
		System.out.println("7단 구구단");
		System.out.println("-".repeat(20));
		for(int i = 2; i < 10; i++) {
			result = dan * i;
			System.out.printf("%d x %d = %d \n", dan, i, result);
		}
		System.out.println("=".repeat(20));		
		
		
	}
	
	
	
	
}
