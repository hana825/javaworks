package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;
import com.callor.utils.Line;

public class AddrEx5 {
	public static void main(String[] args) {

		List<AddressVO> addrs = new ArrayList<>();
		AddressVO adVO = new AddressVO();
		adVO.setName("홍길동");
		adVO.setTel("010-000-0000");
		adVO.setAge(33);
		addrs.add(adVO);
		
		adVO = new AddressVO();
		adVO.setName("이몽룡");
		adVO.setTel("010-000-0000");
		adVO.setAge(19);
		addrs.add(adVO);
		
		adVO = new AddressVO();
		adVO.setName("성춘향");
		adVO.setTel("010-000-0000");
		adVO.setAge(16);
		addrs.add(adVO);
		
		AddrServiceV1 adService = new AddrServiceV1();
		// 3명의 데이터 출력
		adService.printAddr(addrs);
		
		adVO = AddressVO.builder().name("임꺽정").tel("010-000-0000").age(45).build();
		
		// addrs 리스트의 2번째 데이터를 임꺽정 데이터로 변경하고 싶다.
		// addrs.add(AddressVO) : 데이터를 추가하기
		addrs.set(2, adVO);
		System.out.println(Line.sLine(80));
		adService.printAddr(addrs);
		
		for(int i = 0; i < addrs.size(); i ++) {
			for(int j = 0; j < addrs.size(); i ++) {
				if(addrs.get(i).getAge() > addrs.get(j).getAge()) {
//					AddressVO addVO = AddressVO.builder().age(i).build();
				}
			}
		}
		
		
	}

}
