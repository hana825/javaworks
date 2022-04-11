package com.callor.arrays.service;
/*
 * 수행과제 : 5명 학생의 국어점수를 합산
 ** ServiceV1 클래스에 scoreKorSum() 선언
 ** 국어점수를 저장할 변수 5개를 선언
 ** 5개의 변수에 1~100까지 임의의 점수를 저장
 ** 5개 변수의 점수를 합산하여 return
 */
public class ServiceV1A {
	
	// private으로 선언된 makeScore()는 ServiceV1A 클래스 {}에서만 접근(호출)할 수 있다.
	// local method(지역 메서드)라고 한다.
	private int makeScore() {
		
		return (int)(Math.random() * 100) + 1;
	}
	
	// public으로 선언된 scoreKorSum()는 이 프로젝트의 어디에서 클래스의 인스턴스를 생성하고 인스턴스를 통하여 접근(호출)할 수 있다.
	// static이 없으므로 반드시 instance를 통해 호출해야한다.
	public int scoreKorSum() {
		
		// V1에서 Math.random()를 사용하여 점수를 생성하는 코드를 makeScore()로 이전하고, 
		// 점수 생성이 필요한 경우 makeScore()를 호출하여 결과를 사용한다.
		int intS1 = makeScore();
		int intS2 = makeScore();
		int intS3 = makeScore();
		int intS4 = makeScore();
		int intS5 = makeScore();
		
		int intSum = intS1;
		intSum += intS2;
		intSum += intS3;
		intSum += intS4;
		intSum += intS5;
		
		return intSum;
	}

}
