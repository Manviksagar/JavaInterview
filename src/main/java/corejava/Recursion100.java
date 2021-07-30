package corejava;

public class Recursion100 {
    static int  count=0;
    public static void  p1(){
        count++;
        if(count<=10){
            System.out.println(count);
            p1();
        }

    }


    public static void main(String[] args) {

      p1();
    }
}
