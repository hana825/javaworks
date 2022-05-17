package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

/*
 * service.AddrServiceV1 클래스를 선언
 * printAddr() method를 선언
 * AddrEx02에서 printAddr(hong)을 호출하여 주소를 Console에 출력
 */
public class AddrServiceV1 {
	
	// AddressVO type의 매개변수 1개 받기
	public void printAddr(AddressVO hong) {
		System.out.println(hong.toString());
	}
	
	// AddressVO 배열 type의 배개변수 1개 받기
	// 배열의 개수만큼 AddressVO가 전달된다.
	public void printAddrList(AddressVO[] addrs) {
		for(int i = 0; i < addrs.length; i++) {
			System.out.println(addrs[i].toString());
		}
		for(AddressVO vo : addrs) {
			// 객체만 println()에 전달하면 내부에서 vo.toString()을 호출하여 문자열을 받아 출력
			System.out.println(vo.toString());
		}
	}

//	public void printAddr(List<AddressVO> adlist) {
//		for(AddressVO vo : adlist) {
//			System.out.println(vo);
//		}
//	}
	public void printAddr(List<AddressVO> addrs) {
		
		for(int i = 0; i < addrs.size(); i ++) {
			for(int j = i + 1; j < addrs.size(); j ++) {
				if(addrs.get(i).getAge() > addrs.get(j).getAge()) {
					AddressVO addVO = addrs.get(j);
					addrs.set(j,addrs.get(i));
					addrs.set(i, addVO);
				}
			}
		}
		for(AddressVO vo : addrs) {
			System.out.println(vo);
		}
		
	}

}
