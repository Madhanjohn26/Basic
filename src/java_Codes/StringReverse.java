package java_Codes;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.google.common.collect.Lists;

public class StringReverse {
		
	public static void main(String[] args) throws IOException
	{
		for (int i = 5; i>= 1; i--) {
			
			for (int j = 1; j <= 5; j++) {
				System.out.print("");
				if (j>=i) {
					if (j==5) {
						System.out.print(""+j);
						continue;
					}
					System.out.print(j);
				}
				//System.out.print(j);
			}
			//System.out.print("");
			for (int j = 4; j >=1; j--) 
			{
				System.out.print("");
				if (j>=i) {
					System.out.print(j);
				}
				//System.out.print(j);
			}
			System.out.println();
		}
	}
	} 

