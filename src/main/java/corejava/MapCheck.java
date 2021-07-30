package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCheck {

    public static void main(String[] args) {
        Map<Integer, String> m= new HashMap<>();
        m.put(1,"Sagar");
        m.put(2,"ASagar");

        m.replace(1,"Allu");
        Set d=m.keySet();
        System.out.println(d);

        System.out.println(m);

    }

}
