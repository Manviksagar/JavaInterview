package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls = Arrays.asList("Sagar", "pega","selenium");
		//ls.get(3);
		System.out.println(ls.get(2));
		System.out.println(ls.get(2) instanceof String );

		System.out.println(ls.contains("Sagar"));
		List<String> nl = Arrays.asList("Java", "Python");
		List<String>Ar = new ArrayList<String>(nl);
		System.out.println(Ar);
		//System.out.println(ls.addAll(Ar));
		
		
		for(int i =0; i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		
		
		

	}

}
