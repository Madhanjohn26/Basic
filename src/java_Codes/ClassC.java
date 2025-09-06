package java_Codes;

public class ClassC extends ClassB{
	
	int a=10;
	static int s =20;
	
	public ClassC(int a) {
		int c=a;
		System.out.println("Class C");
		System.out.println("c value "+c);
		System.out.println("static value "+s);
	}
	
	@Override
	public void test1() {
		super.test1();
	}
	public final static void test3(int a) {
		System.out.println("test3 "+a);
	}
	
	public final static void test3() {
		System.out.println("test3");
	}

	public static void main(String[] args) {
		
		ClassC c = new ClassC(50);
		c.test1();
		System.out.println(c.a);
		System.out.println(s);
		test3();
		test3(44);
	}

}
