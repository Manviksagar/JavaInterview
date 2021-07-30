package interview;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapCheck {


    public static void main(String[] args) {
        //NavigableMap<Integer,String> mp = new TreeMap<>();
        TreeMap<Integer, String> mp = new TreeMap<>();

        mp.put(3,"Allu");
        mp.put(1,"Sagar");
        mp.put(2,"Vidya");

        System.out.println(mp);
        System.out.println(mp.descendingMap());
        System.out.println(mp.headMap(2));
        System.out.println(mp.subMap(1,3));
    }
}
