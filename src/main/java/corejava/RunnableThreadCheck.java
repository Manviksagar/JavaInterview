package corejava;


class Sag implements Runnable{
	
	public void run() {
		System.out.println("Runnable interface");
	}
}

public class RunnableThreadCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new Sag();
		Thread t1 = new Thread(r);
		Thread t2= new Thread(() -> System.out.println("sagar anonomous thread"));
		t1.start();
		t2.start();

	}

}
