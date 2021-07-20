package corejava;

public class ThreadCheck extends Thread{
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running is calling");
		
		super.run();
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadCheck t1 = new ThreadCheck();
		t1.start(); 
	t1.setName("Sagar");
	t1.join();
		System.out.println(t1.getName());			
System.out.println(t1.isAlive());		
//t1.start();
		
		
	}

}
