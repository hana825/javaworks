package com.callor.app.service;

public class ServiceV2A {
	
	/*
	 * 지금 ServiceV2A 클래스에는 guguDan()가 두 번 선언되어 있다.
	 * 보통은 같은 이름의 method를 두 번 이상 선언하면 오류가 발생한다.
	 * 그런데 자바에서는 method의 매개변수(argument)의 있고 없음에 따라 
	 * 이름은 같지만 서로 다른 method로 판단하여 오류가 발생하지 않는다.
	 * 이것은 자바 뿐만 아니라 객체지향 프로그래밍 언어 공통된 특징이다.
	 */

	public void guguDan() {
		int dan = 3;
		int index = 100;
		
		/*
		 * for(초기화코드 ; 비교코드 ; 변화코드){}
		 * 0. 초기화코드는 for()명령을 만나면 최초에 한 번만 실행
		 * 1. 비교코드를 실행하여 결과가 
		 * 2. true이면 {} 내부의 코드 실행
		 * 3. {}코드가 실행 완료되면 변화코드 실행
		 * 
		 *  비교코드가 false가 되는 순간까지 1~3은 계속 반복
		 */
		for( index = 1; index < 10; index ++) {
			System.out.print( "\n " );
			System.out.print( dan );
			System.out.print( " x " );
			System.out.print( index );
			System.out.print( " = " );
			System.out.print( dan * index );
		}
	} // end guguDan()
	
	/* 
	 * guguDan(변수선언) 형식으로 method 선언하기
	 * method의 괄호안에 선언된 변수를 "argument"라고 한다.
	 * argument : 매개변수, parameter
	 * 호출하는 곳에서 값을 전달하면 전달된 값을 변수에 저장하고 코드내에서 변수 값을 사용하여 연산을 수행한다.
	 * argument가 포함된 method를 호출할 때는 반드시 argument에 합당한 값을 함께 전달해 주어야 한다.
	 * (값을 주입해 주어야한다.)
	 */
	public void guguDan(int dan) {
		
		int index = 1;
		for( index = 1; index < 10; index ++) {
			System.out.print( "\n " );
			System.out.print( dan );
			System.out.print( " x " );
			System.out.print( index );
			System.out.print( " = " );
			System.out.print( dan * index );
		}
		
		
	}
}