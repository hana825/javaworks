package com.callor.arrays.service;
/*
 * 수행과제 : 5명 학생의 국어점수를 합산
 ** ServiceV1 클래스에 scoreKorSum() 선언
 ** 국어점수를 저장할 변수 5개를 선언
 ** 5개의 변수에 1~100까지 임의의 점수를 저장
 ** 5개 변수의 점수를 합산하여 return
 */
public class ServiceV1 {
	
	public int scoreKorSum() {
		
		int intS1 = 0;
		int intS2 = 0;
		int intS3 = 0;
		int intS4 = 0;
		int intS5 = 0;
		
		intS1 = (int)(Math.random() * 100) + 1;
		intS2 = (int)(Math.random() * 100) + 1;
		intS3 = (int)(Math.random() * 100) + 1;
		intS4 = (int)(Math.random() * 100) + 1;
		intS5 = (int)(Math.random() * 100) + 1;
		
		int intSum = intS1;
		intSum += intS2;
		intSum += intS3;
		intSum += intS4;
		intSum += intS5;
		
		return intSum;
	}

}
