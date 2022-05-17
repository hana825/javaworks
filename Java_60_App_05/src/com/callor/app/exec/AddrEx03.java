package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;
/*
 * AddrEx03에서 AddressVO 배열 3개를 선언 및 생성
 * 임의의 데이터를 저장하고 printAddrList()에 전달하여 출력
 */
public class AddrEx03 {
	public static void main(String[] args) {
		
		AddressVO[] addrs = new AddressVO[3]; 
		addrs[0] = AddressVO.builder().name("홍길동").tel("010-111-1111").build();
		addrs[1] = new AddressVO();
		addrs[1].setName("이몽룡");
		addrs[1].setTel("010-222-2222");
		addrs[2] = new AddressVO();
		addrs[2].setName("성춘향");
		addrs[2].setTel("010-333-3333");
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrs);
	}

}
