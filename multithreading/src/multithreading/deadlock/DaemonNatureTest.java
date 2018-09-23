package multithreading.deadlock;

public class DaemonNatureTest extends Thread  // implements new Runnable() {
{

	
	public static void main(String args[]) {
		
		System.out.println(Thread.currentThread().isDaemon());
		DaemonNatureTest t = new DaemonNatureTest();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		t.start();
		//t.setDaemon(false);  //java.lang.IllegalThreadStateException if we try to change Daemon nature after starting the thread
		System.out.println(t.isDaemon());
		
		
		//If last non daemon threads completes its execution then all daemon threads will terminated automatically whether they have executed completely or not 
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
