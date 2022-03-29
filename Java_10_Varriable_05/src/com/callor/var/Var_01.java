package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		
		// 실수(double)형으로 선언을 할 경우 0 보다는 0.0처럼 명확하게 표현하는 것이 좋다.
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;
		
		double douSum = 0;
		double douMin = 0;
		double douMulti = 0;
		double douDiv = 0;
		
		douSum = douNum1 + douNum2;
		douMin = douNum1 - douNum2;
		douMulti = douNum1 * douNum2;
		douDiv = douNum1 / douNum2;
		
		System.out.println(douNum1 + "+" + douNum2 + "=" + douSum);
		System.out.println(douNum1 + "-" + douNum2 + "=" + douMin);
		System.out.println(douNum1 + "x" + douNum2 + "=" + douMulti);
		System.out.println(douNum1 + "÷" + douNum2 + "=" + douDiv);
	}

}
