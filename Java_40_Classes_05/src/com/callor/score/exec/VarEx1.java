package com.callor.score.exec;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class VarEx1 {
	
	public static void main(String[] args) {
		
		// primitive(기본) type keyword
		// primitive type 변수 선언(첫글자 소문자)
		int num1 = 100;
		float num2 = 100.3f;
		boolean bYes = true;
		
		// class type keyword
		// class type 변수 선언(첫글자 대문자)
		// 참조형 변수 선언
		// 다양하고 편리한 기능을 사용할 수 있다.
		Integer intNum1 = 100;
		Float fNum2 = 100.3f;
		Boolean bYes1 = true;
		
		String str = "korea";
		StudentVO stVO = new StudentVO();
		
		StudentVO[] stList = new StudentVO[10];
		
		// interface도 클래스이다. 따라서 변수 stService는 ScoreService 클래스 타입이다.
		ScoreService stService = new ScoreServiceImplV1(); 
		
	}

}
