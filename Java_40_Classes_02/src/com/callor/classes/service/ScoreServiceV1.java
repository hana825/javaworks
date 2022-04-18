package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {
	
	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;
	
	public ScoreServiceV1() {
		this(10);
	}
	public ScoreServiceV1(int length) {
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
				break;
			}
			
			
			System.out.printf("%d 번 점수(정수로, END:중단) >> ", stNum);
			String strKor = scan.nextLine();
			if(strKor.equals("END")) {
				break;
			}
			int intScore = 0;
			try {
				// exception이 발생할 수 있는 코드
				intScore = Integer.valueOf(strKor);
				// 값을 배열에 저장
				student[index] = strName;
				intKor[index] = intScore;
				index ++;	// index를 늘려주지 않으면 값이 채워지지 않는다.
				
			} catch (Exception e) {
				System.out.println("입력한 \"" + strKor + "\"는(은) 숫자로 변경불가!!");
				System.out.println("점수는 정수로만 입력해주세요!!");
			}
		} // while()

		/*
		 * 입력을 배열의 개수만큼 모두 마치고 정상 종료하면 0을 return
		 * 입력 도중 END를 입력하여 중단하였으면 -1을 return
		 */
		
		if(index < student.length) { // 도중에 END를 입력함
			return -1;
		}else { // 모두 입력 끝
			return 0;
			
		}
	}

}
