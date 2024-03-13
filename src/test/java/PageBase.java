import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class PageBase {
    WebDriver driver;
 @BeforeClass
 public void setup(){
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     System.out.println("Setup is completed");
 }

// @AfterClass
//    public void removerDriver(){
//     driver.quit();
// }
}
