package day15.api.io.readwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 문자를 써서 저장하는 클래스는 fileWriter클래스 입니다.
		 * 2. 2바이트 단위로 처리하기 때문에, 한글 쓰기에 적합합니다.
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello2.txt";
		Writer rw = null;
		try {
			rw = new FileWriter(path);
			rw.write("오늘은 6월 4일 입니다. \n아 집에 가고싶다 ㄹㅇ"); //문자를 바로 쓸수 있음
			//한번에 출력됨
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				rw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
