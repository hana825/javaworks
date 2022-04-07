package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

/*
 * 수행과제
 ** ServiceV1 클래스에 scoreSum() 선언
 ** intKor, intEng, intMath 변수 선언
 ** 1~100까지 임의 값을 생성하여 각 변수에 저장
 ** 변수에 저장된 값을 합산하여 return
 ** ControllerV1에서 scoreSum()을 호출하여 return된 결과를 Console에 출력  
 */
public class ControllerV1 {
	
	public static void main(String[] args) {
		// ServiceV1 클래스는 선언만 한 상태(아무런 코드가 아직 준비되지 않은 상태)
		// 이지만 ServiceV1 클래스를 사용하여 serviceV1 인스턴스를 생성할 수 있다.
		ServiceV1 serviceV1 = new ServiceV1();
		int intSum = serviceV1.scoreSum();
		System.out.println(intSum);
	}

}
