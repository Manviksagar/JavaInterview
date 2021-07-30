package corejava;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={20,40,60,50,23,45};
        int sea=40;
        System.out.println(Arrays.stream(a).max().getAsInt());
        Arrays.stream(a).filter(i ->i==sea).forEach(System.out::println);
        boolean flag = false;
        for(int i=0;i<a.length;i++) {
            if (sea == a[i]) {
                System.out.println("Element Fount at positon: " + i);
                flag = true;
                break;
            }

        }
                if(flag==false) {
                    System.out.println("Not found");
                }




    }
}
