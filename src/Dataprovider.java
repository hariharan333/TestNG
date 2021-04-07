import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

    @Test(dataProvider = "LoginDataProvider")//,dataProviderClass = CustomDataProvider.class)
    public void loginTest(String mail,String pwd)
    {
        System.out.println("mail : "+mail +" , pwd : "+pwd);
    }
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data = {{"abc@gmail.com" , "abc","lklkjfijsdiojf"},{"xyz@gmail.com" , "xyz"},{"hari@gmail.com" , "hari"}};
        return data;
    }
}
