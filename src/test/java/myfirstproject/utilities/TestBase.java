package myfirstproject.utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {
    protected static WebDriver driver;

   /*
   -We keep testBase class abstract because we dont want to create object from this class
   - TestBase class is used to store repetitive methods which are used as pre-conditions or post conditions
   - we make WebDriver protected because we want it to avaible for all classes within this project

   -TestBase will be extended to classes where test steps are and this class will provide before and adter methods automatically
    */

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver(); // instantiating chrome driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicit wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // allows time to the page to load
        driver.manage().window().maximize();
    }
    //   @AfterEach
//    public void tearDown() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicit wait
//        Thread.sleep(2000);
//        driver.quit();
//    }

}
