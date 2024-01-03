package myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        // set up and create chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // for selenium

    // maximise the window
        driver.manage().window().maximize();
        //Thread.sleep(2000);

    // go to a google home page
        driver.get("https://www.google.com");
        Thread.sleep(2000); // hard java wait
    // staying in the same class, navigate to techproeducation homepage
        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
    // navigate back to google
        driver.navigate().back();
        Thread.sleep(2000);
    //navigate forward to techproeducation
        driver.navigate().forward();
        Thread.sleep(2000);
    //refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);
    // close/quit the browser
        driver.quit();


        /*
        NOTES:
        1. How do you go to a page in Selenium?
        - I use get() or navigate() method. get() is more commonly used.
        2. What is the difference between get() and navigate() method?
        - both are used to go to a page
        - get is shorter than navigate method
        - navigate() allows you to go forward,back and refresh the page
        - get method accepts String only as parameter, navigate() accepts string and url

        3. What's the difference between quit() and close()?
        close() method closes the current active window, whereas quit() method closes all opened windows
        4. What is Thread.sleep() ?
        - it is JAVA wait. we call it HARD WAIT as well.
         */




    }
}
