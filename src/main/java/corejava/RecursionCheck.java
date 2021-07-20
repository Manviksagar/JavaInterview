package corejava;

public class RecursionCheck {

    public static int factCheck(int n){
        if(n==0){

            return 1;

        }
        else return n*factCheck(n-1);

    }

    public static void main(String[] args) {
      int fact=  RecursionCheck.factCheck(3);
        System.out.println(fact);
    }

}
