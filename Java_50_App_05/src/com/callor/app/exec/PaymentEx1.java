package com.callor.app.exec;

public class PaymentEx1 {
	/*
	 * 대한민국 화폐단위
	 * 5만, 1만, 5천, 1천, 5백, 1백, 50, 10
	 * 
	 */
	public static void main(String[] args) {
		int pay = 3_928_880;
		
		// 5만원권
		int paper = (pay / 50_000);
		System.out.println("5만원권 : " + paper);
		pay -= (paper * 50_000);	// 5만원권을 제외한 금액
		paper = (pay / 10_000);
		System.out.println("1만원권 : " + paper);
		
		// 반복적으로 10원권까지 계산수행하면 결과를 얻을 수 있다.
		
	}

}
