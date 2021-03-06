package com.callor.app.exec;

import com.callor.app.model.BookVO;

public class Exec05 {
	public static void main(String[] args) {
		// 객체(클래스를 사용한) 배열 10개 선언
		// 선언된 객체 배열은 아직 사용할 준비가 안된 상태
		// NullPointerException 발생
		BookVO[] bookVO = new BookVO[10];
		
		// 배열의 각 요소를 반드시 초기화 해야한다.
		for(int i = 0; i < bookVO.length; i++) {
			bookVO[i] = new BookVO();
		}
		
		int index = 2;
		bookVO[index] = new BookVO();
		bookVO[index].setTitle("자바의 정석");
		bookVO[index].setComp("도울출판사");
		System.out.println("도서명: " + bookVO[index].getTitle());
		System.out.println("출판사: " + bookVO[index].getComp());
	}

}
