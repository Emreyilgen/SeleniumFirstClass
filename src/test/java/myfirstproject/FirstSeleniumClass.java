package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
    //1. set tahe path of the driver
        //System.setProperty("what is it", "where is it");
        System.setProperty("webdriver.chrome.driver", "src/Resources/drivers/chromedriver.exe");
       // System.setProperty("web-driver.http.factory", "jdk-http-client");

    // 2. create the driver
        WebDriver driver = new ChromeDriver();


    // 3. Now that driver is ready, automate the function that we want to perform
        driver.get("https://www.google.com/");
    }



}
