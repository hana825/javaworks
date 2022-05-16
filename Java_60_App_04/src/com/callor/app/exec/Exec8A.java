package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

// data.txt 파일의 내용을 console에 한 라인씩 출력하시오
public class Exec8A {
	public static void main(String[] args){
		
		String fileName = "src/com/callor/app/exec/data.txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(fileName);
			scan = new Scanner(is);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
