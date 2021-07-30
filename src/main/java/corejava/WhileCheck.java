package corejava;

public class WhileCheck {
    public static void main(String[] args) {
        int n=1234;
        int num=1234;
        int rev=0;

        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;

        }
        System.out.println(sum);

        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);

        //do while
        int h=1;
        do{
            System.out.println("h");
        }while(h!=1);


    }

}
