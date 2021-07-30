package corejava;

public class ArmStrong {

    public static void main(String[] args) {
        int num=1741720;
        int temp_n=num;
        int len= String.valueOf(num).length();
        double out=0.0;
        int rem=0;
        while(num>0){
            rem=num%10;
            num = num/10;
            out=out+Math.pow(rem,len);
        }
        if(out==temp_n)
         System.out.println("The number is armsrtong "  + out);
        else{
            System.out.println("not a armstrong number");
        }

//2nd way
        int n=1634; //1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836,
        int temp=n;
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r*r;

        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("The number is armstrong : "+ sum);
        }
        else{
            System.out.println("not a armstrong number");
        }

    }
}
