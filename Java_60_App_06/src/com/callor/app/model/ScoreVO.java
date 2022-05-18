package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * 문자열 학번
 * 정수형 국어, 수학, 영어 변수를 갖는 VO클래스 생성
 * 
 * 모든 변수는 private으로 선언하고 
 * Lombok.jar 설정 → getter, setter, toString, builder 정의
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreVO {
	private String stNum;
	private int intKor;
	private int intMath;
	private int intEng;	
}
