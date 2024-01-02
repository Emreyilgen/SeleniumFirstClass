package myfirstproject.Day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Practice_ourself {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://www.Facebook.com");
        Thread.sleep(3000);
        //driver.navigate().back();
        // Thread.sleep(3000);
        //driver.navigate().forward();
        //Thread.sleep(4000);

        //driver.get("https://www.kitapyurdu.com");
        //driver.navigate();
        //Thread.sleep(3000);
        //driver.navigate().back();

        driver.close();


    }
}
