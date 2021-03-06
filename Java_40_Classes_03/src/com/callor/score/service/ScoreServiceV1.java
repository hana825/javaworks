package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {

	protected ScoreV2VO[] scores;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	// 학생이름리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV1(String[] stNames) {

		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {

		for (int i = 0; i < scores.length; i++) {
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);

		}
	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 v1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		int KorSum = 0;
		int EngSum = 0;
		int MathSum = 0;
		int AllSum = 0;
		float AvgSum = 0.0f;

		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n", scores[i].getfAvg());
			KorSum += scores[i].getIntKor();
			EngSum += scores[i].getIntEng();
			MathSum += scores[i].getIntMath();
			AllSum += scores[i].getIntSum();
			AvgSum += scores[i].getfAvg();
		}
		System.out.println(Line.sLine(50));
		System.out.printf("\t%d\t%d\t%d\t%d\t%3.2f\n", KorSum, EngSum, MathSum, AllSum, AvgSum / scores.length);

	} // printScore()

}
