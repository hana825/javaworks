package com.callor.app.controller;

import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreController {
	public static void main(String[] args) {
		ScoreServiceImplV1 sc = new ScoreServiceImplV1();
		sc.makeScore();
	}

}
