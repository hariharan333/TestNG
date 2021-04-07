/*
1. Setup - open browser and application
2. login
3. close
 */

import org.testng.annotations.Test;

public class FirstTestCase {

        //@Test
        @Test(priority = 0)
        void setup()
        {
            System.out.println("this is setup test");
        }

        //@Test
        @Test(priority = 1)
        void login()
        {
            System.out.println("this is login test");
        }
        //@Test
        @Test(priority = 2)
        void teardown()
        {
            System.out.println("closing browser");
        }

}
