package testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGCheck {


    @Test( priority = 0, invocationCount = 5 )
    public void test1(){
        System.out.println("exected from invocationCount");
    }
    @Test(priority = 1)
    public void failedcase(){

        Assert.assertEquals("sa", "SA");
    }
    @Test(priority = 2 )

    public void skipCase(){

         throw new SkipException("skipped case");
    }
    @Test(priority = 3, dependsOnMethods ="skipCase",alwaysRun = true )
    public void dependent(){

        System.out.println("Executed even skipped dependancy");
    }
    @Test(dependsOnMethods = "failedcase")
    public void depandancyTest(){
        System.out.println("Depeancy test");
    }



}
