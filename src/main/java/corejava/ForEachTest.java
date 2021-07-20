package corejava;

import java.util.ArrayList;
import java.util.List;



public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky"); 
		
        gamesList.forEach(System.out::println);
        System.out.println("----------------");
        gamesList.stream().forEachOrdered(System.out::println);
	}

}
