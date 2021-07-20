package corejava;

public class Pallamdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pallamdrome is 121 is reverse also equal
		
		int n =123;
		int r;
		int temp=0;
		
		while (n>0) {
			
			r=n % 10;
			temp =temp*10 +r;
			n=n/10;
			
		}
		System.out.println(temp);

	}

}
