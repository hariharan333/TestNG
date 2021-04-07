import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 0)
    void TestOne()
    {
        System.out.println("this is test1....");
    }
    @Test(priority = 1)
    void TestSecond()
    {
        System.out.println("this is test2....");
    }
    @Test(priority = 2)
    void TestThird()
    {
        System.out.println("this is test3....");
    }
    @Test(priority = 3,enabled = false)
    void TestFourth()
    {
        System.out.println("this is test4....");
    }
}
