/*
 * Var_01.java 파일이 src/com/callor/var 폴더에 저장되어 있다는 표식
 */
package com.callor.var;
// class 선언문, class prototype
public class Var_01 {
	
	// 여기에서 부터 실제 명령문 코드가 작성되는곳
	public static void main(String[] args) {
	
		// 코드에서 사용되는 수의 체계
		// 정수(integer), 실수
		// 정수형(int type), 실수형(float type)
		
		// 변수는 데이터를 기억장소에 임의로 선언해놓는 별명
		// datatype 변수명;
		
		
		
		/*
		 * int: 정수형 데이터를 저장할 기억장소를 예약해달라
		 * num1: 예약한 기억장소에 쉬운 num1이라는 이름을 붙여라
		 * =30: 예약된 num1 기억장소에 30을 저장(할당)
		 * 
		 * 정수형 변수 num1을 선언하고 정수 255값으로 초기화하라
		 * 정수형 변수 num2를 선언하고 정수 88값으로 초기화하라
		 */
		int num1 = 255;
		int num2 = 88;
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		
		System.out.println(40.0 / 30.0);
		
		int num3 ;								// 정수형 번수 num3를 선언"만" 하기
		int num4 ;
		
		num3 = 40;								// 선언된 정수형 변수 num3에 40을 대입(할당, 저장)하기
		num4 = 100;
		
		/*
		 * 선언만 된 변수에서는 값을 읽을 수 없다.
		 * 반드시 앞에서 어떤 값이라도 저장, 할당을 해야만 이후에 읽을 수 있다.
		 */
		
		System.out.println(num3 + num4);
		
		// 변수에 저장할 값을 정하지 못했을 때 숫자일 경우는 0으로 초기화를 해 둔다.
		int num5 = 0;
		System.out.println(num5);
		
		/*
		 * 변수 명명규칙과 패턴
		 * 1. 첫 글자는 무조건 소문자
		 * 2. 이후에는 대소문, 숫자, _를 조합할 수 있다.
		 * 3. 두 개 이상의 단어를 조합하여 만드는 것이 좋다.
		 * 4. 두 개 이상의 단어를 조합할 때 두 번째 단어부터 대문자 (camel case)
		 * 5. 두 개 이상의 단어를 조합할 때 첫 번째 단어는 변수의 type으로 만드는 것이 좋다.(hungarian 표기법)
		 * 
		 */
		
//		int num1 = 0;							// 오류 발생: Duplicate local variable num1; 중복된 변수!
		int num11 = 0;							// 다른 변수명으로 선언
		int intNum1 = 0;						// hungarian 표기법
		
//		좋은 변수 이름 짓기
//		변수명이 길어지더라도 2개 이상의 단어를 조합한다.
//		변수명만 보고 어떤 데이터가 담겨있는지 유추할 수 있도록 한다.
		
		int intStNum = 20220101;				// ex) 학번
		int intTelNum = 01000000;
		int intStAge = 33;		
		
		int a = 0;								// <- 안좋은 예
		
		
		System.out.println(intTelNum + intStNum);
		
		
		
		
	}
}
