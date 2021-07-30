package corejava;

public class InnerClassCheck {

    int id=100;
    class inner{

        public void display(){
            System.out.println(" the outer id is printing in inner : " + 100);
        }
    }

    public static void main(String[] args) {
        InnerClassCheck out = new InnerClassCheck();
        InnerClassCheck.inner in =out.new inner();
        in.display();

    }
}
