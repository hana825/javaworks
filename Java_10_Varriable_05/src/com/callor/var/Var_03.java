package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		double doNum1 = 0.0;
		double doNum2 = 0.0;
		
		doNum1 = Math.random() * 1000 + 1;
		doNum2 = Math.random() * 1000 + 1;
		
		double doSum = 0;
		double doMin = 0;
		double doMulti = 0;
		double doDiv = 0;
		
		doSum = doNum1 + doNum2;
		doMin = doNum1 + doNum2;
		doMulti = doNum1 + doNum2;
		doDiv = doNum1 + doNum2;
		
		System.out.printf("%f + %f = %f\n", doNum1, doNum2, doSum);
		System.out.printf("%f - %f = %f\n", doNum1, doNum2, doMin);
		System.out.printf("%f x %f = %f\n", doNum1, doNum2, doMulti);
		System.out.printf("%f ÷ %f = %f\n", doNum1, doNum2, doDiv);
		
	}

}
