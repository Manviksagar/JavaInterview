package corejava;


interface HelloCheck{
    public void great();
}
interface paraCheck{
    public void para(int a, int b);
}
public class MethodRef {
    public static void  display(){
        System.out.println("Hello Youtube");
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    //object instance calling
    public void check(){
        System.out.println(2*5);
    }

    public static void main(String[] args) {
        HelloCheck ss=MethodRef::display;
        ss.great();

        paraCheck para=MethodRef::add;
        para.para(2,3);
       HelloCheck c = new MethodRef()::check;
       c.great();
    }
}
