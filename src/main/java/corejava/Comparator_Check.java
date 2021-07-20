package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator_Check {

    public static void main(String[] args) {
        List<LaptopPojo> lplist = new ArrayList<>();

        lplist.add(new LaptopPojo(1,"dell",20));
        lplist.add(new LaptopPojo(2,"HP",40));
        lplist.add(new LaptopPojo(3,"apple",80));
        Collections.sort(lplist);
       lplist.forEach(System.out::println);

    }



}
