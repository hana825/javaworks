package com.callor.arrays.exec;

/*
 * 수행과제
 ** 정수형 배열 100개를 선언하고
 ** Math.random()를 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저장
 ** 배열의 각 요소에 저장된 수 중에서 "짝수의 리스트"를 예제처럼 출력하시오
 */
public class ExecV6 {
	public static void main(String[] args) {

		String dLine = "=";
		String sLine = "-";
		System.out.println(dLine.repeat(50));
		System.out.println("짝수 리스트");
		System.out.println(sLine.repeat(50));

		int[] intNum = new int[100]; // 배열 선언..
		int intAll = 0;
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1; // 1~100 임의의 수
		}
		for (int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;
			if (bEven) {
				System.out.print(intNum[i] + ",\t");
				intAll++;
				if (intAll % 5 == 0) {
					System.out.println();
				}
			}
			
		}

		System.out.println("\n" + dLine.repeat(50));
	} // end main()

}
