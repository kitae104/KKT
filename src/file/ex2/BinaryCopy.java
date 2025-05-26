package file.ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {

	public static void main(String[] args) {
		String oriFileName = "C:/Windows/explorer.exe";
		String newFileName = "C:/Temp/exp.exe";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(oriFileName);
			fos = new FileOutputStream(newFileName);
			
			int i; 
			byte[] readByte = new byte[1024];
			while( (i = fis.read(readByte)) != -1) {
				fos.write(readByte, 0, i);
			}
			System.out.println("정상적으로 복사되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}

}
