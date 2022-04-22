package com.callor.score.exec;

public class VarEx2 {
	
	public static void main(String[] args) {
		
		int num1 = 100;
		/*
		 *  Boxing
		 *  int형 변수에 담긴 데이터를 Integer형 변수에 복사
		 *  int형 데이터에 box를 씌워서 Integer형으로 변환한 후 저장
		 */
		Integer intNum1 = num1;	// int → Integer
		/*
		 *  Unboxing
		 *  Integer형 변수에 담긴 데이터를 int형 변수에 복사
		 *  Integer box에 담긴 데이터를 box를 풀어해쳐 내용물만 int형 변수에 저장
		 */
		num1 = intNum1;			// Integer → int
		
	}

}
