package com.callor.controller;


public class ControllerV4 {
	public static void main(String[] args) {
		
		// if(비교연산식) { }
		// for( ;; ) { }
		
		int intNum = 1;
		// for() 반복문코드 내부에 조건연사을 추가하여 반복횟수를 제한하기
		// break : for() 반복문을 중단하는 키워드
		
		/*
		 * for( ;??; ) 반복문의 두 번째 명령문은 비교문이 들어간다
		 * 이때부터 for() 반복문은 두 번째 명령문의 결과가 true 일때만 {} 의 코드를 실행한다.
		 */
		for ( ; intNum < 101; ) {
			System.out.printf("\t%d x %d = %d\n ", 3, intNum, 3 * intNum++);
			
			
		} // end for
		
	}
}
