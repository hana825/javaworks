package com.callor.arrays.exec;

/*
 * 수행과제 선생님 답
 ** Math.random()를 사용하여 1~100까지 임의의 수를 생성하고 생성한 수가 짝수인가 홀수인가 판별하는 코드를 작성
 */
public class ExecV1A {
	public static void main(String[] args) {

		int intNum = (int) (Math.random() * 100) + 1;
		
		boolean bEven = false;
		// intNum1 변수를 2로 나눈 나머지가 0인가?
		// intNum1 변수에 담긴 값을 2로 나눈 나머지가 0인가?
		// 0이면 true가 bEven에 저장, 아니면 false가 bEven 저장된다.
		bEven = (intNum % 2) == 0;
		
		if (bEven) {
			System.out.println(intNum + "는(은) 짝수");
		} else {
			System.out.println(intNum + "는(은) 홀수");
			System.out.println(intNum + "는(은) 짝수가 아님");
		}
	}

}
