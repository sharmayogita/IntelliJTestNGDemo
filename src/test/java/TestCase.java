import org.testng.annotations.Test;

public class TestCase {

    @Test(priority = 1)
    void setUp(){
        System.out.println("i am setup method");
    }
    @Test(priority = 2)
    void beforeTest(){
        System.out.println("i am inside before test method");
    }
    @Test(priority = 3)
    void afterTest(){
        System.out.println("i am inside after test method");
    }
}
