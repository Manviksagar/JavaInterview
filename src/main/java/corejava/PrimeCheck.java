package corejava;

public class PrimeCheck {


    public static void primeNum(int n){
        int count=0;
        for(int i =1; i<=n; i++){

            if(n%i==0){
                count++;
            }
        }
        if(count<=2){
            System.out.println(n +" is Prine number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }


    }

    public static void main(String[] args) {
        PrimeCheck.primeNum(6);
    }
}
