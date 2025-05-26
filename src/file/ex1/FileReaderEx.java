package file.ex1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Temp/aaa.txt");
		int i;
		while( (i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
