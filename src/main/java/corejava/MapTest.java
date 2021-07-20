package corejava;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> sa= new HashMap<Integer, String>();
		sa.put(1, "Sagar");
		sa.put(2, "pega");
		System.out.println(sa.containsKey(2));
		System.out.println(sa.containsValue("pega"));
		System.out.println(sa.get(1));
		
		for(Map.Entry<Integer, String>ss:sa.entrySet()) {
			
			System.out.println(ss.getKey());
			System.out.println(ss.getValue());
		}

	}

}
