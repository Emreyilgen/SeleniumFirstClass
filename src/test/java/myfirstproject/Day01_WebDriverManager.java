package myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day01_WebDriverManager {
    public static void main(String[] args) {

        /*
        1. Add WebDriverManager repository from https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
        and get the latest version, paste it INSIDE dependencies tag
        2. Reload the project
        3. Use WebDriverManager class to set up (latest way)
         */


        //1. set up
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.edgedriver().setup();

        //2. create the driver
        WebDriver driver = new ChromeDriver();
       //WebDriver driver1 = new FirefoxDriver();


        // 3. Now that driver is ready, automate the function that we want to perform
        driver.get("https://www.techproeducation.com");

    }
}
