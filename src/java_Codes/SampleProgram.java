package java_Codes;

import java.io.File;

public class SampleProgram {
	
	public static void main(String[] args)  {
	

		File f = new File("E:\\Madhan\\Pass.txt");
		boolean find = f.exists();
		if (find) {
			System.out.println("True exists");
		}else {
			System.out.println("False not exists");
		}
		
		String path = f.getPath();
		System.out.println("The file path is:"+path);
		long length = f.length();
		System.out.println("Length of the file"+length);
		/*
		File file= new File("E:\\Madhan");
		String[] list = file.list();
		for (String files : list) {
			System.out.println("file name :"+files);
		}
		*/
	
}
}


