package com.callor.app.exec;
/*
 * 수행과제(2022-05-13)
 * 1. random() 메서드를 사용하여 1~100까지 임의의 정수를 생성하여 변수에 저장
 * 2. 변수에 저장된 값이 짝수인지 홀수인지 판별하여 console에 출력
 * 3. 이 과정을 10회 반복
 * 
 * → for() 반복문으로 10번 반복하면서 임의 정수를 생성하고 짝수인지 홀수인지 판별
 */
public class Exec1 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 100) +1;
			if(num % 2 == 0) {
				System.out.println(num + "는(은) 짝수");
			} else {
				System.out.println(num + "는(은) 짝수가 아님");
			}			
		}
	}

}
