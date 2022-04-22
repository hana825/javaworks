package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {
	
	// 학생데이터들을 저장할 배열변수
	private StudentVO[] stList;
	// 학생데이터가 저장된 text file 이름
	private String stFile;
	
//	private StudentServiceImplV1() {
//		// TODO Auto-generated constructor stub
//	}
	public StudentServiceImplV1(String stFile, int length) {
		
		this.stFile = stFile;
		this.stList = new StudentVO[length];
		// 배열을 선언할 때는 초기화해주어야한다.
		for(int i = 0; i < this.stList.length; i++) {
			this.stList[i] = new StudentVO();
		}
	}

	@Override
	public void loadStudent() {
		
		InputStream is = null;
		try {
			is = new FileInputStream(this.stFile);		// FileInputStream : stFile 파일정보를 읽어서 is객체에 담기
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(stFile + "파일을 찾을 수 없습니다");
			return;
		}
		
		Scanner scan = new Scanner(is);
//		while(true) {
//			boolean bYes = scan.hasNext();
//			if(bYes == false) {
//				break;
//			}
//			String stLine = scan.nextLine();
//			System.out.println(stLine);
//		}
		int index = 0;	// stList의 요소를 가리키는 값
		while(scan.hasNext()) {
			String stLine = scan.nextLine();
			System.out.println(stLine);
			String[] stInfos = stLine.split(":");	// 문자열을 분리해서 stInfos 배열에 담기
			
			System.out.println("학번: " + stInfos[0]);
			System.out.println("이름: " + stInfos[1]);
			System.out.println("학년: " + stInfos[2]);
			System.out.println("학과: " + stInfos[4]);
			System.out.println("주소: " + stInfos[5]);
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
			
			stList[index++] = stVO;		// ++는 뒤에. 앞에 넣으면 OutOfBoundary 오류 뜸
		} // end while 여기를 지나면 stList에 모든 데이터가 담겨있을 것
		this.printStudents();
		
	} // end loadStudent()
	
	// V1에서 stList에 담긴 데이터들을 확인하기 위하여 내부용으로 만든 method
	private void printStudents() {	// interface에는 없고 내부에서 사용하려고 만든 메서드
		
		for(int i = 0; i < stList.length; i++) {
			System.out.println(stList[i].toString());
		}
		for(StudentVO vo : stList) {
			System.out.println(vo.toString());
		}
		
	}

	@Override
	public StudentVO[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
