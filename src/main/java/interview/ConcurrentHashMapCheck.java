package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapCheck {

    public static void main(String[] args) {
        //map used we get Concurrent
        //Map<Integer, String> li = new HashMap<>();
        Map<Integer, String> li= new ConcurrentHashMap<>();
        li.put(1,"Allu");
        li.put(2,"Sagar");
        Iterator it= li.keySet().iterator();
        while(it.hasNext()){
            System.out.println( it.next());
            li.put(3,"Vidya");
        }
    }
}
