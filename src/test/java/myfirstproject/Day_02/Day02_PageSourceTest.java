package myfirstproject.Day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_PageSourceTest {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to amazon home page
        driver.get("https://wwww.amazon.com");
        Thread.sleep(10000);
        driver.navigate().refresh();


        // get the page source code
        String pageSource = driver.getPageSource();
        //System.out.println("pageSource = " + pageSource);

        //validation
        if (pageSource.contains("Magazine")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();


    }
}
