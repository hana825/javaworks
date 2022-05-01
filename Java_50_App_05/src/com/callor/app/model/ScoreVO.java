package com.callor.app.model;

public class ScoreVO {
	private int stNum;
	private int stKor;
	private int stEng;
	private int stMath;
	private int stSum;
	private float stAvg;

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public int getStKor() {
		return stKor;
	}

	public void setStKor(int stKor) {
		this.stKor = stKor;
	}

	public int getStEng() {
		return stEng;
	}

	public void setStEng(int stEng) {
		this.stEng = stEng;
	}

	public int getStMath() {
		return stMath;
	}

	public void setStMath(int stMath) {
		this.stMath = stMath;
	}

	public int getStSum() {
		return stSum;
	}

	public void setStSum(int stSum) {
		this.stSum = stSum;
	}

	public float getStAvg() {
		stAvg = .2f;
		return stAvg;
	}

	public void setStAvg(float stAvg2) {
		this.stAvg = stAvg2;
	}

	@Override
	public String toString() {
		return "" + stNum + "\t" + stKor + "\t" + stEng + "\t" + stMath + "\t" + stSum + "\t" + stAvg;

	}

}
