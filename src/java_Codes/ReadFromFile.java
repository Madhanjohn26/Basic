package java_Codes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Madhan\\Java -Seleninum\\Recurson program.txt");
		String s = FileUtils.readFileToString(f);
		String[] split = s.split("");
		for (String s1 : split) {
			System.out.println(s);
			
		}

	}

}
