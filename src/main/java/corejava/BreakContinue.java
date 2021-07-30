package corejava;

public class BreakContinue {

    public static void main(String[] args) {

        for(int i =1; i<=10;i++){

            if(i==5){
                break;
            }
            System.out.println(i);
        }

        //Continue checking...
        for(int i =1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
