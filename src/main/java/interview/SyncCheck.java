package interview;

public class SyncCheck {
    int count=0;
    public synchronized  void  increment(){
        count++;

    }

    public static void main(String[] args) throws InterruptedException {
        SyncCheck sc = new SyncCheck();
        Thread t1 = new Thread(()->{
            for(int i=1;i<=10000;i++){
                sc.increment();
            }
        });
        Thread t2 = new Thread(()->{
           for(int i=1;i<=10000;i++){
               sc.increment();
           }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sc.count);
    }

}
