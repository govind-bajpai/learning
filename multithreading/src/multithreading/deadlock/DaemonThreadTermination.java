package multithreading.deadlock;

public class DaemonThreadTermination extends Thread{

	
	//If last non daemon threads completes its execution then all daemon threads will terminated automatically whether they have executed completely or not 
	
	public static void main(String[] args) {
		
		System.out.println("InMain method");
		DaemonThreadTermination t = new DaemonThreadTermination();
		t.setDaemon(true);
		t.start();
		//t.setDaemon(false);  //java.lang.IllegalThreadStateException if we try to change Daemon nature after starting the thread
	

		System.out.println("Main thread completed");
		
		
		//If last non daemon threads completes its execution then all daemon threads will terminated automatically whether they have executed completely or not 
		
		

	}
	
	public void run() {
		System.out.println("Executing rum nethod");
		for(int i=0;i<10;i++) {
			System.out.println("child Thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {			
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Completed rum method");
	}

}
