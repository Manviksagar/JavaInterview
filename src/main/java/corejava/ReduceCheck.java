package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceCheck {

    public static void main(String[] args) {
       int result= Stream.of(2,4,6,8).map(i->i*2).reduce(0,(a,b)->a+b);
        System.out.println(result);
        List<Integer> num= Arrays.asList(2,4,6,8);
        List<Integer> four=num.stream().filter(i->i%4==0).map(i->i).collect(Collectors.toList());
        System.out.println(four);
        //Method Reference
       int fourplus= four.stream().reduce(0, Integer::sum);
        System.out.println(fourplus);
        //four.stream().forEach(System.out::println);
        System.out.println(four.stream().count());



    }
}
