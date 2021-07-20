package corejava;

interface Animal{
	
	public void bark() ;
}
interface Bank{
	
	public int withdraw(int a, int b) ;
}


public class LambdaCheck {
	
	public static void main(String[] args) {
		
		Animal aa= ()-> System.out.println("Animal barkking");
		aa.bark();
		Bank bb = (a,b)->a+b;
		
		System.out.println(bb.withdraw(2, 3));
	}

}
