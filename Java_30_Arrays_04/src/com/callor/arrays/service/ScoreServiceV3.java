package com.callor.arrays.service;

public class ScoreServiceV3 {
	
//	클래스 영역에 선언된 배열(변수) = 인스턴스 배열(변수)
	
//	정보의 은닉 : 클래스 영역에 선언된 변수에 private을 설정하므로써 변수는 외부의 접근을 차단한다.
//	private int[] intKor = new int[100];	이렇게 하는것은 별루 추천하지 않는다. 여기서는 선언만 해주는 것이 좋다.
	private int[] intKor;
	public ScoreServiceV3() {
		intKor = new int[100];
	}

	public void printNo1Score() {
		System.out.println("1번 학생 점수 : " + intKor[1]);
	}
}
