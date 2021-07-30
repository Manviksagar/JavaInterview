package corejava;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    int id;
    List<Integer> mobile;

    public Employee(int id, List<Integer> mobile) {
        this.id = id;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getMobile() {
        return mobile;
    }
}

public class MapvsFlatmap {
    public static void main(String[] args) {
        List<Employee> h= new ArrayList<>();
        h.add(new Employee(1, Arrays.asList(234,4567)));
        h.add(new Employee(2, Arrays.asList(235656234,45645467)));

        // returning List of list streams using map
       //List<List<Integer>>g= h.stream().map(t->t.getMobile()).collect(Collectors.toList());
      List<Integer> g =  h.stream().flatMap(t->t.getMobile().stream()).collect(Collectors.toList());

        System.out.println(g);
    }




}
