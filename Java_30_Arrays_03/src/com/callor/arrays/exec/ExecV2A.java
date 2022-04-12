package com.callor.arrays.exec;

/*
 * 수행과제 답
 ** 정수형 배열 100개를 선언하고
 ** Math.random()를 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저장
 ** 배열의 각 요소에 저장된 수가 짝수인가 아닌가를 판별하여 출력하시오
 */
public class ExecV2A {

	public static void main(String[] args) {

		int[] intNum = new int[100];
		// for() 명령문의 선언부에서 변수를 선언하면
		// for() {} 이 끝날 때 변수가 소멸된다.
		// 같은 method 내에서 같은 이름의 변수를 계속 사용할 수 있다.
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;
			if (bEven) {
				System.out.printf(i + "." + "%d는(은) 짝수\n", intNum[i]);
			} else {
				System.out.printf(i + "." + "%d는(은) 짝수가 아님\n", intNum[i]);

			}
		}

	}

}
