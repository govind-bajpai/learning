
public class Child extends Parent{
	int a;
	int b;
	
	static int c=7;
	static int d = 8;
	
	public Child() {
		this.a=3;
		this.b=4;
	}
	
	public static void staticSum() {
		System.out.println(c+d);
	}

	public void sum() {
		System.out.println(getC()+getD());
	}
//public static int getC() {
//		// TODO Auto-generated method stub
//		return c;
//	}
//
//public static int getD() {
//		// TODO Auto-generated method stub
//		return d;
//	}

public void printing() {
	System.out.println("I am printing child");
}

public void printChild() {
	System.out.println("I am print child");
}

public static final void staticPrint1() {
	System.out.println("I am static print Child");
}
}
