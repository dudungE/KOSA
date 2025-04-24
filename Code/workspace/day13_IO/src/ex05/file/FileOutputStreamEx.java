package ex05.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamEx {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			OutputStream  os = null;
			
			try {
//				os = new FileOutputStream("memo2.txt");  // 상대경로
				os = new FileOutputStream("C:/app/yuna.txt");  // 절대경로
//				os = new FileOutputStream("C:\\app\\yuna.txt");  // 절대경로
				
				while( true ) {
					System.out.println("문자열 입력 요망 : ");
					String str = sc.nextLine() + "\r\n";
					
					//if( str.toUpperCase().equals("EXIT\r\n") ) {
					if( str.equalsIgnoreCase("EXIT\r\n") ) {
						System.out.println(str.length() + "byte만큼 썼습니다. ");
						break;
					} // end if
					
					os.write(str.getBytes());   // 예외발생.  읽어들인 문자 str의 길이(getBytes()) 만큼 써주세요.
					//System.out.println(str);   // 화면출력
				} // end while
				
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {		os.close();		} catch (IOException e) {		e.printStackTrace();		}
			}  // end try
		}
}





