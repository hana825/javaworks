package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// data.txt 파일의 내용을 console에 한 라인씩 출력하시오
public class Exec08 {
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "src/com/callor/app/exec/data.txt";
		FileInputStream input =  new FileInputStream(fileName);
		
		Scanner scan = new Scanner(input);
		
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
	}

}
