package com.callor.app.controller;

import com.callor.app.service.ScoreService;

/*
 * 수행과제
 * 1. 학생의 국어, 영어, 수학 점수를 저장할 model.ScoreVO 클래스를 작성
 * 2. service.ScoreService 클래스를 작성
 * 3. List<ScoreVO> 리스트를 선언하고
 * 4. makeScore() method에서 각 과목에 50 ~ 100까지 임의의 정수를 생성하여 저장, 
 * 5. 점수 List를 20개 생성
 * 6. scorePrint() method에서 성적 리스트를 출력
 */
public class ScoreController {
	
	public static void main(String[] args) {
		ScoreService scService = new ScoreService();
		
		scService.makeScore(20);
		scService.scorePrint(20);
	}

}
