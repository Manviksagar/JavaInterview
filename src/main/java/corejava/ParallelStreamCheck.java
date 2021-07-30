package corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamCheck {

//nested try catch block
    public static void main(String[] args) {
        try{
        //IntStream.range(1,20).forEach(System.out::println);
        int a =1/0;
    }
        catch(Exception e){
            try {
                int b =2/0;
            }
            catch (Exception ex){
                System.out.println(ex.getMessage().toString());

            }
        }
List<Integer> li = Arrays.asList(2,4,6,8);
        List<Integer> reverseC=li.stream().parallel().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseC);
long co=li.parallelStream().filter(i -> i%2==-0).map(i->i).count();
        System.out.println(co);

        }
}
