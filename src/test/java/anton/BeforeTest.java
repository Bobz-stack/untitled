package anton;

import org.testng.annotations.BeforeMethod;

public class BeforeTest {
    @org.testng.annotations.BeforeTest
    public void metod1(){
        System.out.println("Действия перед тестом");

    }
    @BeforeMethod
    public void metod2(){
        System.out.println("Действия перед методом");
    }
}
