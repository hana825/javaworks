package com.callor.arrays.exec;

/*
 * 수행과제
 ** 정수형 배열 100개를 선언하고
 ** Math.random()를 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저장
 ** 배열의 각 요소에 저장된 수가 짝수인가 아닌가를 판별하여 출력하시오
 */
public class ExecV2 {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		for( int i = 0; i < intNum.length; i ++ ) {
			intNum[i] = (int)(Math.random() * 100) + 1;
		}
		
		for( int i = 0; i < intNum.length; i ++ ) {
			// boolean 초기값은 false.
			boolean bEven = false;	// 초기화라 상관없다~~!!!
			bEven = (intNum[i] % 2) == 0;	// 이게 상관있는거!!
			if(bEven) {
				System.out.println(i +"  "+ intNum[i] + "는(은) 짝수");
			} else {
				System.out.println(i +"  "+ intNum[i] + "는(은) 짝수가 아님");
				

			}
		}
			
	}

}
