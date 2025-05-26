package file.ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/windows/system.ini");
			int i;
			while( (i = fis.read()) != -1 ) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {		
			System.err.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("입출력시 오류 발생 ");
			e.printStackTrace();
		}
	}

}
