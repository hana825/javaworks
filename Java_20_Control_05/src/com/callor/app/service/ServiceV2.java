package com.callor.app.service;

public class ServiceV2 {

	public void guguDan() {
		int intIndex = 1;

		System.out.println("구구단 3단");
		System.out.println("============");
		for ( ; intIndex < 10 ; intIndex ++ ) {
			System.out.printf("%d x %d = %d\n", 3, intIndex, 3 * intIndex);
		}
		System.out.println("============");
	}
}
