package M1;


class Abc implements Runnable{

	// Override the Run method of Runnable interface
	
	@Override
	public void run() {
		
		try {
			for(int i=1; i<=5 ; i++) {
				System.out.println("T : "+i+" "+Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}	
}
public class Q47 {
	public static void main(String[] args) throws Exception {
		
		// Creating an object of Abc class which implements the Runnable interface.
		Abc obj = new Abc();
		
		// Creating First Thread
		Thread t1 = new Thread(obj);
		
		// Creating Second Thread
		Thread t2 = new Thread(obj);
		
		//Starting First Thread
		t1.start();
		
		// sleep time 2000 mili seconds
		Thread.sleep(2000);
		
		// starting Second Thread
		
		t2.start();
	}
}