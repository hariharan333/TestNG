import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 0)
    void setup()
    {
        System.out.println("this is setup test");
    }

    @Test(priority = 2)
    void addCustomer()
    {
        System.out.println("this is add customer test");
    }

    @Test(priority = 1)
    void searchCustomer()
    {
        System.out.println("this is search customer test");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 3)
    void teardown()
    {
        System.out.println("closing browser");
    }
}
