import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"regression"})
    void Test1()
    {
        System.out.println("this is test 1 ...");
    }
    @Test(groups = {"regression"})
    void Test2()
    {
        System.out.println("this is test 2 ...");
    }
    @Test(groups = {"functional"})
    void Test3()
    {
        System.out.println("this is test 3 ...");
    }
    @Test(groups = {"functional"})
    void Test4()
    {
        System.out.println("this is test 4 ...");
    }
    @Test(groups = {"regression","functional"})
    void Test5()
    {
        System.out.println("this is test 5 ...");
    }
}
