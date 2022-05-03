package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
<<<<<<< HEAD
=======
import com.callor.app.utils.Line;

>>>>>>> a3980d8c4e9df16a733d0faee64d13c3a77d7741

public class ScoreService {
	
	ScoreVO scVO = new ScoreVO();
	// VO 클래스 사용하여 리스트 선언
	List<ScoreVO> scList = new ArrayList<>();
	
	// 총점용 변수 선언
	int sumKor = 0;
	int sumEng = 0;
	int sumMath = 0;
	int sumAll = 0;

	public void makeScore(int length) {
		int stKor = 0;
		int stEng = 0;
		int stMath= 0;
		int stSum = 0;
		float stAvg = 0;
		
		for(int i = 0; i < length; i++) {
			scVO = new ScoreVO();
			// 임의 점수 저장
			stKor = (int)(Math.random() * 50) + 50;
			stEng = (int)(Math.random() * 50) + 50;
			stMath = (int)(Math.random() * 50) + 50;
			stSum = stKor + stEng + stMath;
			stAvg = (float)stSum / 3.0f; // 소수점
			
			// scVO에 저장
			scVO.setStNum(i+1); // 학번은 1번부터
			scVO.setStKor(stKor);
			scVO.setStEng(stEng);
			scVO.setStMath(stMath);
			scVO.setStSum(stSum);
			scVO.setStAvg(stAvg);
			
			// scList 리스트에 scVO 추가해주기
			scList.add(scVO);
			
			// 총점 계산
			// scList에 추가한 i번째 국어점수(scVO.setStKor(stKor))를 get해서
			// sumKor에 반복해서 더하고 저장하여 국어점수의 총 합을 계산한다.
			sumKor += scList.get(i).getStKor();
			sumEng += scList.get(i).getStEng();
			sumMath += scList.get(i).getStMath();
			sumAll += scList.get(i).getStSum();
		}
		
	}
	
	public int scorePrint(int length) {
		
		System.out.println(Line.dLine(50));
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println(Line.sLine(50));

		for(int i = 0; i < length; i++) {
			// toString(){return "" + stNum + "\t" + stKor + "\t" + stEng + "\t" + stMath + "\t" + stSum;}
			System.out.print(scList.get(i));
			// 평균은 소수점 두자리까지 별도로 출력함
			System.out.printf("\t%.2f", scList.get(i).getStAvg());
			System.out.println();
			
		}
		
		System.out.println(Line.dLine(50));
		System.out.printf("총점\t%d\t%d\t%d\t%d", sumKor, sumEng, sumMath, sumAll);
		
		return 0;
		
	}

	public ScoreService() {
		List<ScoreVO> scVO = new ArrayList<>();
	}
	
	public void makeScore() {
		
	}
	
	
}
