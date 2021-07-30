package corejava;

interface ana{
    public void imple();
    }


public class AnonymousCheck {

    public static void main(String[] args) {
       ana c= new ana(){


              public void imple(){
            System.out.println("working");
        }


       };
       c.imple();
    }
}
