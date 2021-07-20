package corejava;

import com.google.common.collect.Collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare_Check {

    public static void main(String[] args) {

        List<Student> su = new ArrayList<>();
        su.add(new Student(1, "Sagar", 200));
        su.add(new Student(2, "Allu", 400));
        su.add(new Student(3, "Sag", 800));
        Comparator<Student> s = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMarks() < o2.getMarks()) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };

        Collections.sort(su ,s);
        su.forEach(System.out::println);



    }
}
