package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV5 {
	
	/*
	 * 수행과제
	 ** intKor 배열 선언
	 ** makeScore(), printScore(), sumScore() 메서드 선언
	 ** 임의의 성적 생성하여 intKor 배열에 저장
	 ** 배열에 저장된 성적일람표 출력
	 ** 배열에 저장된 성적 총점계산하여 출력
	 */
	private int[] intKor;
	int intSum = 0;
	public ScoreServiceV5() {
		intKor = new int[100];		
	}
	public void makeScore() {
		for(int i = 0; i < intKor.length; i ++) {
			intKor[i] = (int)(Math.random() * 50) + 51;
		}
	}
	
	public void printScore() {
		System.out.println(Line.dLine);
		System.out.println("성적 일람표");
		System.out.println(Line.sLine);
		for(int i = 0; i < intKor.length; i ++) {
			System.out.printf("%d\t" , intKor[i]);
			if( (i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}

	public void sumScore() {
		for(int i = 0; i < intKor.length; i ++) {
			intSum += intKor[i];
		}
		System.out.println(Line.sLine);
		System.out.println("성적 총점 : " + intSum);
		System.out.println(Line.dLine);
	}
	
	

}
