import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginPage extends PageBase{


    @Test(dataProvider = "LoginTestData")
    public void userLogin(String userName, String password){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

//        String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
//        String actualCurrentUrl = driver.getCurrentUrl();
//        assertEquals(actualCurrentUrl,expectedHomePageUrl, "invalid url");
    }

    @DataProvider(name= "LoginTestData")
    public Object[][] Login(){
        Object[][] data = new Object[4][2];
        data[0][0] = "standard_user";
        data [0][1]= "secret_sauce1";

        data[1][0] = "standard_user22";
        data [1][1]= "secret_sauce";

        data[2][0] = "standard_user333";
        data [2][1]= "secret_sauce11";

        data[3][0] = "standard_user";
        data [3][1]= "secret_sauce";

        return data;
    }

    @Test
     public void homePage(){
        driver.getCurrentUrl();
    }

}
