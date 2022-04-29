package com.callor.app.model;

public class ScoreVO {
	private int stKor;
	private int stEng;
	private int stMath;
	
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
	@Override
	public String toString() {
		return "ScoreVO [stKor=" + stKor + ", stEng=" + stEng + ", stMath=" + stMath + "]";
	}
	

}
