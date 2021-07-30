package corejava;

public class Stars {

    static{
        System.out.println("Static block invoked");
    }

    public static void main(String[] args) {
        //decresing stars
        for(int c=1;c<=4;c++) {
            for (int j = 5; j >c; j--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        //increacing stars
        for(int c=1;c<=4;c++) {
            for (int j = 1; j <=c; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}
