package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV2 {
	
	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;
	
	public ScoreServiceV2() {
		this(10);
	}
	public ScoreServiceV2(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;
	}
	
	public int input() {
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("대한 고교 성적처리 V2");
		System.out.println(Line.sLine(lineLength));
		
		int index = 0;
		
		while(index < student.length) {
			int stNum = index + 1;
			System.out.printf("%d 번 이름(END:중단) >> ", stNum);
			String strName = scan.nextLine();
			if(strName.equals("END")) {
				return -1;
			}
			
			
			System.out.printf("%d 번 점수(정수로, END:중단) >> ", stNum);
			String strKor = scan.nextLine();
			if(strKor.equals("END")) {
				return -1;
			}
			int intScore = 0;
			try {
				// exception이 발생할 수 있는 코드
				intScore = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intScore;
				index ++;	// index를 늘려주지 않으면 값이 채워지지 않는다.
				
			} catch (Exception e) {
				System.out.println("입력한 \"" + strKor + "\"는(은) 숫자로 변경불가!!");
				System.out.println("점수는 정수로만 입력해주세요!!");
			}
		} // while()
		return 0;
	}

}
