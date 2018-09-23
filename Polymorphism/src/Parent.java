
public class Parent {

	int a;
	int b;
	static int c=5;
	static int d = 6;
	public Parent() {
		this.a=1;
		this.b=2;
	}
	
	public static void staticSum() {
		System.out.println(c+d);
	}
	public void sum() {
		System.out.println(c+d);
	}
	
	public static int getC() {
		// TODO Auto-generated method stub
		return c;
	}

public static int getD() {
		// TODO Auto-generated method stub
		return d;
	}
	public void printing() {
		System.out.println("I am printing Parent");
	}
	
	public void printParent() {
		System.out.println("I am print Parent");
	}
	
	public static final void staticPrint() {
		System.out.println("I am static print Parent");
	}
}

