package com.callor.todo.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.callor.todo.model.TodoVO;
import com.callor.todo.model.TodoVO.TodoVOBuilder;
import com.callor.todo.service.TodoService;
import com.callor.utils.Line;

public class TodoServiceImplV1 implements TodoService {
	
	private final List<TodoVO> todoList;
	
	public TodoServiceImplV1() {
		todoList = new ArrayList<>();
	}
	
	/*
	 * 매개변수로 content(할 일) 내용을 전달받아 
	 * key, 추가날짜, 시간을 생성한 후 TodoVO에 담고 todoList에 추가하기
	 * 
	 * java에서 날짜(시간)을 취급하는 방법이 여러가지 있다.
	 * 1.7 이전에서는 Date, Calendar 클래스를 사용하여 날짜와 시간을 취급했다.
	 * 1.8 이후에서는 LocalDate, LocalTime, LocalDateTime 이라는 클래스를 사용하여 날짜와 시간을 취급한다.
	 */

	@Override
	public void todoInsert(String content) {
		// 컴퓨터의 현재 날짜 시각을 읽어오기
		// java 1.8 에서는 Date 클래스의 생성자에 System.currentTimeMillis() method를 주입해 주어야 한다.
		Date curDate = new Date(System.currentTimeMillis());
		
		// Date 객체의 값을 날짜, 시각 문자열 타입으로 변경하기 위한 객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		// 현재 날짜, 시각에 해당하는 문자열 생성하기
		// SimpleDateFormat에 의해서 패턴대로 날짜 시각 문자열을 만든다.
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		
		// Data 관련하여 사용되는 KEY, ID 값
		// Data의 무결성을 보장하기 위한 모든 데이터(레코드단위, row단위)는 데이터를 유일하게 식별(구별)할 수 있는 데이터를 가지고 있어야 한다.
		// 각 언어, DBMS 등에서는 고유의 방법으로 ID를 만들고 관리한다.
		// java에서는 java.util.UUID 클래스를 사용하여 범 우주적으로 유일한 ID값을 생성하는 도구를 제공한다.
		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();
		
		TodoVO tVO = TodoVO.builder().tKey(idStr).sdate(today).stime(time).tContent(content).build();
		todoList.add(tVO);

	}

	@Override
	public List<TodoVO> todoSelectAll() {
		return todoList;
	}

	@Override
	public TodoVO findByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(TodoVO tVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveTodo(String fileName) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * TODO 완료하기
	 * 매개변수로 전달받은 num 값은 List 요소의 실제 값보다 1만큼 크다
	 * num 값이 4라면 실제로는 3번 요소를 선택한 것이다.
	 * 
	 * 선택한 요소의 edate, etime 부분을 현재 시스템의 날짜와 시간을 사용하여 문자열로 바꾼다음 setting
	 */
	@Override
	public void compTodo(Integer num) {
		
		// 제거해버리기~~~!
//      Scanner scan = new Scanner(System.in);
//      System.out.println("어떤거 완료처리?");
//      int index = scan.nextInt();
//      if((index-1) < 0 || index > todoList.size()){
//         System.out.println("1부터" + todoList.size() + "까지만 입력");
//      } else {
//         todoList.remove(index-1);
//      }
//      System.out.println(Line.sLine(50));
		
		// if()문 넣어보려던거
//		int size = todoList.size();
//	      int index = 0;
//	      for(index = 0; index < size; index ++) {
//	         System.out.printf("%d\t", num+1);
//	         System.out.print(todoList.get(num).getSdate() + "\t");
//	         System.out.print(todoList.get(num).getStime() + "\t");
//	         System.out.print(todoList.get(num).getTContent() + "\t");
//	         if((num-1) < 0 || num > size ) {
//	            break;
//	            
//	         } else {
//	            
//	            String comp = todoList.get(num).getEdate() == null || todoList.get(num).getEdate().isEmpty() ? "완료됨" : "진행중";
//	            System.out.println(comp);
//	         }
//	      }

		// 모르겠다~~~!!!
		Date curDate = new Date(System.currentTimeMillis());
		
		// Date 객체의 값을 날짜, 시각 문자열 타입으로 변경하기 위한 객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		// 현재 날짜, 시각에 해당하는 문자열 생성하기
		// SimpleDateFormat에 의해서 패턴대로 날짜 시각 문자열을 만든다.
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);

		System.out.println(Line.dLine(50));
		System.out.print("No\t");
		System.out.print("완료일자\t");
		System.out.print("완료시간\t");
		System.out.print("할 일\t");
		System.out.println("상태");
		System.out.println(Line.sLine(50));
		
		int size = todoList.size();
		for(num = 0; num < size; num ++) {
			System.out.printf("%d\t", num+1);
			todoList.get(num).setEdate(today);
			todoList.get(num).setEtime(time);
			System.out.print(todoList.get(num).getEdate() + "\t");
			System.out.print(todoList.get(num).getEtime() + "\t");
			System.out.print(todoList.get(num).getTContent() + "\t");
			
			String comp = todoList.get(num).getEdate() == null || todoList.get(num).getEdate().isEmpty() ? "진행중" : "완료됨";
			System.out.println(comp);
		}

	}
}
