package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {
    public static void main(String[] args) {
        //if we use add in between iteration we ger ConcurrentModification
        //List<Integer> li = new ArrayList<>();
        List<Integer> li = new CopyOnWriteArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);

        Iterator it=li.iterator();

while(it.hasNext()){
    System.out.println(it.next());
    li.add(4);
}
    }

}
