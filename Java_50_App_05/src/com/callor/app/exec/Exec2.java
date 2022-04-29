package com.callor.app.exec;

public class Exec2 {
	/*
	 * 수행과제
	 * 대한민국의 통화는 5만원, 1만원, 5천원, 1천원, 500원, 100원, 50원, 10원 권이 있다.
	 * 급여를 현금으로 지급하는데 최소한의 액면권 개수로 지급하려고 한다.
	 * 급여 금액을 임의로 설정하고 액면권 개수를 계산하여 출력
	 */
	public static void main(String[] args) {
		
		int pay = 3905320;
		
		int paper = 50000;
		int sw = 1;

		while(true) {
			// paper 액면가에 대한 화폐매수 계산
			int paperCount = (int)(pay / paper);

			if(sw > 0) {
				paper /= 5;
				System.out.printf("5만원권 개수 : %d\n", paperCount);
			} else {
				pay -= (paper * paperCount);
				paper /= 2;
				System.out.println(pay);
				System.out.printf("1만원권 개수 : %d\n", paperCount);
				break;
			}
			sw *= (-1); // 1, -1 계속 변화
		} // while
	}
}
