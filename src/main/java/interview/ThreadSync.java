package interview;

public class ThreadSync {

    public static void main(String[] args) {

        Thread t1= new Thread(()->
        {
                System.out.println("Sagar" + Thread.currentThread().getName());
        int count=11;
        for(int i=10;i<=20;i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            ;
            System.out.println(count++);
        } });

        Thread t2= new Thread(()->{
            int countt=1;
            for(int i=1;i<=10;i++){
                try {Thread.sleep(100);} catch(Exception e){};
                System.out.println(countt++);
            }
        });

        t1.start();
        try {Thread.sleep(10);} catch(Exception e){};
        t2.start();
    }
}
