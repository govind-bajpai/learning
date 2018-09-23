package multithreading.deadlock;

public class TestDeadlock extends Thread{

	ClassA a = new ClassA();
	ClassB b = new ClassB();
	
	public void run() {

		
		b.method3(a);// by child thread
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		TestDeadlock d = new TestDeadlock();
		d.start();
		d.a.method1(d.b);  // by main thread
		
	}
}
