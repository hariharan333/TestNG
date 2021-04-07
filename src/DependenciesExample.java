import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesExample {

    @Test
    void startCar()
    {
        System.out.println("car started");

    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("car driving");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("car stopped");
    }
    //Test always run property
    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    void parkCar()
    {
        System.out.println("car parked");
    }
}
