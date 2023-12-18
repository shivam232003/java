package M1;

class Alpha implements Runnable{

	// override the run method
	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class Q45 {
	public static void main(String[] args) throws InterruptedException {
		
		// Create an object of Alpha which implements the Runnable 
		Alpha a = new Alpha();
		
		// Create a thread using runnable interface
		Thread t = new Thread(a);
		
		t.start();
		
		for(int i=1; i<=5; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
}