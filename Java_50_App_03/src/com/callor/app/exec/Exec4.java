package com.callor.app.exec;

public class Exec4 {
	
	/* 
	 * 1~100까지 임의 수를 생성하고 
	 * 그 수가 소수(prime number)인지 판별하시오
	 * 
	 * 소수 
	 * : 1과 자신 이외의 약수를 갖지 않는 수
	 * : 2부터 자신-1까지 수로 나누어 나머지가 한번도 0이 나오지 않는 수
	 */
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 100) + 1;
		System.out.println(num);
		isPrime(num);
		
		
	}
	public static void isPrime(int num) {
		// 0과 1은 소수가 아니다
		if(num < 2) {
			System.out.println("소수가 아닙니다.");
			return;
		}
		// 2는 소수다
		if(num == 2) {
			System.out.println("소수입니다.");
			return;
		}
		// 2 ~ 임의 수
		for(int i = 2; i < num; i++) {
			// 소수가 아닐 경우
			if(num % i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
			
		}
		System.out.println("소수입니다.");
		return;
	}

}
