package com.callor.method;

public class Method_02 {
	public static void main(String[] args) {
		
		/**********************************************************
		 * 명령문 해석
		 * 1. num()를 실행하여 => num()를 호출(Call)하여 실행하고
		 * 2. num()가 return하는 데이터를 intNum1 변수에 저장하라
		 **********************************************************/
		int intNum1 = num();
		double douNum1 = doNum();
		long longNum1 = longNum();
		float fNum1 = floatNum();
		boolean bYes = bYes();
		
		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(douNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes);
		System.out.println(str);
		
	}
	public static int num() {
		return 100;
	}
	public static double doNum() {
		return 100.0;
	}
	public static long longNum() {
		return 200_000_000_000L;
	}
	public static float floatNum() {
		return 300.0f;
	}
	public static boolean bYes() {
		return true;
	}
	public static String nation() {
		return "HelloKorea";
	}
	
}
