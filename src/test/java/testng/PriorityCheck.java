package testng;

import org.testng.annotations.Test;

public class PriorityCheck {

    @Test(priority = -1)
    public void t1(){
        System.out.println("Prioty minus");
    }
    @Test(priority = 0)
    public void t2(){
        System.out.println("Prioty zero");
    }
    @Test(priority = 2)
    public void t3(){
        System.out.println("Prioty positive]");
    }
    @Test()
    public void t4(){
        System.out.println("Prioty no priorit]");
    }
}
