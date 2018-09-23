package multithreading.deadlock;

public class ClassA {
	

	public synchronized void method1(ClassB b) {
		
		System.out.println("Thread start execution of method1");
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			
		}
		System.out.println("Thread trying to call B's method4");
		b.method4();
		
		
	}
	
	public synchronized void method2() {
		for(int i=0;i<1000;i++) {
			//do nothing
			
		}
		System.out.println("Executing method 2");
	}
	
}
