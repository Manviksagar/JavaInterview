package corejava;

public class FinalizeCheck {

    public void finalize(){
        System.out.println("gc b call");
    }

    public static void main(String[] args) {
        FinalizeCheck fc = new FinalizeCheck();
        fc=null;
        System.gc();
    }


}
