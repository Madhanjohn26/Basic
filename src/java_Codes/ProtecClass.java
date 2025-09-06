package java_Codes;

public class ProtecClass {
	
	public static void main(String[] args)
	{
		String s="java";
		try {
			int i=0;
			while (true) {
				s.charAt(i);
				i++;
							}
		}catch (StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Error Error"+e);
		}
		
	}

	
}
