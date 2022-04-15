package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {

//	상속을 염두해두고 클래스를 선언 할 때는 인스턴스변수들을 private이 아닌 protected로 선언한다.
//	protected는 private 의 성질을 가지면서 상속받은 클래스에서 상속받아 변수를 선언한 것과 같은 효과를 낸다.
//	인스턴스변수도 상속이 된다.

	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;
	
	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
	}
	
	public int input() {
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("빛나라 고교 성적처리 v1");
		System.out.println(Line.sLine(lineLength));
		
		int index = 0;
		for(index = 0; index < students.length; index ++) {
			int stNum = index + 1;
			System.out.printf("%d 번 학생 이름(END:중단) : ", stNum);
			
			// 키보드에서 문자열 입력받기
			String strName =scan.nextLine();
			
			// if()문 위에 아래와 같은 코드를 위치하면 END 문자열이 students[index] 요소로 저장된다.
//			students[index] = strName;

			/* 이름대신 END 문자열을 입력하면 입력받기 중단 */
			if(strName.equals("END")) {
				break;
			}
			
			// 학생 이름을 배열에 저장할 때는 if() 다음에 위치해야 한다. 
			// 만약 if()위에 코드를 위치하면, 중단되기 전에 students[index] 요소에 END문자열이 먼저 저장되기 때문에 학생 이름에 END가 나타날 것이다.
			students[index] = strName;

			System.out.printf("%d 번 국어점수 : >", stNum);
//			int intScore = scan.nextInt();
//			intKor[index] = intScore;
			String strScore = scan.nextLine();
			int intScore = 0;
			if(strScore.equals("")) {
				System.out.println("점수는 숫자만 가능!");
			} else {
				intScore = Integer.valueOf(strScore);
			}
			intKor[index] = intScore;
			
		} // for()
		
		return 0;
	} // input()
	
	public void print() {
		for(int i = 0; i < students.length; i++) {
			System.out.printf("%s\t", students[i]);
		}
		System.out.println();
	}
	
	
}