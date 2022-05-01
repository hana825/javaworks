package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.utils.Line;


public class ScoreService {
	ScoreVO scVO = new ScoreVO();
	List<ScoreVO> scList = new ArrayList<>();
	
	public void makeScore(int length) {
		int stKor = 0;
		int stEng = 0;
		int stMath= 0;
		int stSum = 0;
		float stAvg = 0;
		
		for(int i = 0; i < length; i++) {
			scVO = new ScoreVO();
			stKor = (int)(Math.random() * 50) + 50;
			stEng = (int)(Math.random() * 50) + 50;
			stMath = (int)(Math.random() * 50) + 50;
			stSum = stKor + stEng + stMath;
			stAvg = stSum / 3.2f;
			
			scVO.setStNum(i+1);
			scVO.setStKor(stKor);
			scVO.setStEng(stEng);
			scVO.setStMath(stMath);
			scVO.setStSum(stSum);
			scVO.setStAvg(stAvg);
			
			scList.add(scVO);
		}
		
	}
	
	public int scorePrint(int length) {
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumAll = 0;
		
		System.out.println(Line.dLine(50));
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println(Line.sLine(50));

		for(int i = 0; i < length; i++) {
			System.out.println(scList.get(i));
		
			sumKor += scList.get(i).getStKor();
			sumEng += scList.get(i).getStEng();
			sumMath += scList.get(i).getStMath();
			sumAll += scList.get(i).getStSum();
		}
		
		System.out.println(Line.dLine(50));
		System.out.printf("총점\t%d\t%d\t%d\t%d", sumKor, sumEng, sumMath, sumAll);
		
		return 0;
		
	}

}
