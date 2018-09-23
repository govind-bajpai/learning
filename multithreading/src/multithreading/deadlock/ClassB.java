package multithreading.deadlock;

public class ClassB {
	
	
	public synchronized void method3(ClassA a) {
		
		System.out.println("Thread start execution of method3");
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			
		}
		System.out.println("Thread trying to call A's method2");
		a.method2();
		
		
		
	}
	
	public synchronized void method4() {
		for(int i=0;i<1000;i++) {
			//do nothing
			
		}
		
		System.out.println("Executing method 4");
		
	}
}
