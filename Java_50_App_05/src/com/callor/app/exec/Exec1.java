package com.callor.app.exec;

public class Exec1 {
	/*
	 * 1. 학생 25명에게 간식을 주려고 한다. 설문 조사 결과 피자를 간식으로 원하고 있다.
	 * 2. 피자는 한 판에 6개의 조각으로 되어있다.
	 * 3. 6개 조각의 피자를 25명이 부족하지 않게 나눠 먹으려면 최소 5판의 피자를 주문해야 한다.
	 * 4. random() 메서드를 사용하여 25~50의 정수를 생성하고 주문할 피자 판수를 계산하는 코드를 구현해 봅니다.
	 */
	public static void main(String[] args) {
		// 25~50까지 정수 생성
		int num = (int)(Math.random()* 25) + 25;
		int pizza = 6;
		// 인원수 / 피자수로 나누었을 때 그 결과가 0이거나 최소 1이상이어야 한다.
		if(num % pizza == 0) {
			System.out.printf("인원 %d는 %d의 피자가 필요", num, num/pizza);
		} else {
			int pan = (num/pizza);
			System.out.printf("인원 %d는 %d의 피자가 필요", num, pan);
		}
		
		
		
		
	}

}
