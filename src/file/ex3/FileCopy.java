package file.ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		String oriFileName = "C:/Windows/explorer.exe";
		String newFileName = "D:/Temp/exp.exe";
		
		FileInputStream fis = new FileInputStream(oriFileName);
		FileOutputStream fos = new FileOutputStream(newFileName);
		
		int i;
		byte[] readByte = new byte[100];
		
		while( (i = fis.read(readByte)) != -1) {
			fos.write(readByte, 0, i);
		}
		System.out.println("정상적으로 복사되었습니다.");
		fos.close();
		fis.close();
	}

}
