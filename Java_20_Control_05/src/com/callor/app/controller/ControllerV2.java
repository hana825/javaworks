package com.callor.app.controller;

import com.callor.app.service.ServiceV2;
import com.callor.app.service.ServiceV2A;

/*
 * ServiceV2 클래스에 guguDan()를 선언하고, guguDan()는 구구단 3단을 (직접)출력한다.
 * ControllerV2에서는 guguDan() 호출하여 구구단을 보여준다.
 */
public class ControllerV2 {
	public static void main(String[] args) {
		
		ServiceV2 serviceV2 = new ServiceV2();
		serviceV2.guguDan();
		
		ServiceV2A sA = new ServiceV2A();
		sA.guguDan();
		
		System.out.println("\n=================");
		
		sA.guguDan(8);
		
	}

}
