package com.callor.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1{

	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}
	
	/*
	 * 저장된 todolist.txt 파일을 읽어서 todoList에 추가하기
	 * 
	 * todolist.txt 파일 열기
	 * 		열기 할 파일은 V1의 saveFileName에 저장되어 있다.
	 * 한 라인씩 읽어서 comma(,) 기준으로 split 하고
	 * todoVO에 담고 todoList에 추가
	 * 					V1의 todoList 객체가 생성되어 있다.
	 */
	protected void loadTodoList() {
		
		// InputStream을 생성하고 
		InputStream is = null;
		// Scanner에 연결!
		Scanner scan = null;
		try {
			is = new FileInputStream(this.saveFileName);
		} catch (FileNotFoundException e) {
			System.out.println(saveFileName + " 파일을 찾을 수 없습니다");
			return;
		}

		// key, sdate, stime, edate, etime, content
		int T_KEY = 0;
		int T_SDATE = 1;
		int T_STIME = 2;
		int T_EDATE = 3;
		int T_ETIME= 4;
		int T_CONTENT= 5;
		
		scan = new Scanner(is);
		while(scan.hasNext()) {
			// 파일로 부터 한 라인을 읽어서 line 변수에 담기
			String line = scan.nextLine();
			// 읽어들인 line 을 컴마(,) 기준으로 split(분해)
			// 분해한 결과는 String형 배열이다.
			String[] todo = line.split(",");
			
			// text 파일에 데이터를 저장하면 마지막에 공백의 Line이 추가되는 경우가 있다.
			// 이때는 split으로 분해한 배열의 개수가 부족하게 된다.
			// 이러한 상황을 방지하기 위하여 아래 코드를 추가한다.
			if(todo.length < T_CONTENT + 1) continue;
			
			String eDate = todo[T_EDATE];
			String eTime = todo[T_ETIME];
			
			if(eDate.equalsIgnoreCase("null")) eDate = null;
			if(eTime.equalsIgnoreCase("null")) eTime = null;
			
			TodoVO tVO = TodoVO.builder()
								.tKey(todo[T_KEY])
								.sdate(todo[T_SDATE])
								.stime(todo[T_STIME])
								.edate(eDate)
								.etime(eTime)
								.tContent(todo[T_CONTENT])
								.build();
			todoList.add(tVO);
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end loadTodo
		
		
	}

	@Override
	public void update(Integer num, String content) {
		int index = num - 1;
		TodoVO tVO;
		try {
			tVO = todoList.get(index);
		} catch (Exception e) {
			System.out.println("선택한 항목이 리스트에 없습니다");
			return;
		}
		// 할 일 변경
		tVO.setTContent(content);
		
		// update 후에 내용을 파일에 자동으로 저장하기
		try {
			this.saveTodo(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
