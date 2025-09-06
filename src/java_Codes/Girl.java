package java_Codes;

public class Girl implements Boy,Boy1{
	@Override
	public void boyName() {
		
		System.out.println("Boy Name");
		
	}
	@Override
	public void girlName() {
		
		System.out.println("Girl Name");
		
	}
	
	@Override
	public void fathername() {
		System.out.println("Father name");
		
	}
	public static void main(String[] args) {
		
		Girl g = new Girl();
		g.boyName();g.girlName();
		g.fathername();

	}

}
