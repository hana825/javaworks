package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV2;

public class ScoreControllerV2 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 scServiceV1 = new ScoreServiceV2(3);
		int intResult = scServiceV1.input();
		if(intResult < 0) {
			System.out.println("입력 도중 중단함");
		} else {
			System.out.println("입력을 모두 마침");
		}
	}

}
