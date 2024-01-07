
    package myfirstproject.practices.practice01;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

    public class Q4_Calculate {

        WebDriver driver;  // class level ... larger scope

        @BeforeEach
        public void setUp(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait
        }

        @AfterEach
        public void tearDown() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }

        @Test
        public void calculateTest(){

//        Navigate to  https://testpages.herokuapp.com/styled/index.html
            driver.get("https://testpages.herokuapp.com/styled/index.html");
//        Click on  Calculator under Micro Apps
            driver.findElement(By.id("calculatetest")).click();
//        Type any number in the first input
            driver.findElement(By.id("number1")).sendKeys("6");
//        Type any number in the second input
            driver.findElement(By.cssSelector("#number2")).sendKeys("8");
//        Click on Calculate
            driver.findElement(By.id("calculate")).click();
//        Get the result
            String result = driver.findElement(By.id("answer")).getText();

//        Verify the result
            Assertions.assertEquals(result, "14");
//        Print the result
            System.out.println("result = " + result);
//        Close the browser by using @AfterEach annotation

        }

        //   HW
        @Test
        public void multiplyTest() throws InterruptedException {
            Faker faker = new Faker();
//        Navigate to  https://testpages.herokuapp.com/styled/index.html
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            Thread.sleep(1000);
//        Click on  Calculator under Micro Apps
            driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
            Thread.sleep(1000);
//        Type any number in the first input
            driver.findElement(By.id("number1")).sendKeys("3");
            Thread.sleep(1000);
//        Type any number in the second input
            driver.findElement(By.id("number2")).sendKeys("8");
            Thread.sleep(1000);
//        Select the options in dropdown
            WebElement timesOptions = driver.findElement(By.xpath("//*[@id='function']"));
            Thread.sleep(1000);
            Select select = new Select(timesOptions);
            Thread.sleep(1000);
           // select.selectByVisibleText("times");
            select.selectByValue("times");
            Thread.sleep(1000);
//        Click on Calculate
            driver.findElement(By.xpath("//*[@id='calculate']")).click();
            Thread.sleep(1000);
//        Get the result
           String getResult = driver.findElement(By.xpath("//*[@id='answer']")).getText();
            Thread.sleep(2000);
//        Verify the result
            Assertions.assertTrue(getResult.equals("24"));
            Thread.sleep(2000);
//        Print the result
            System.out.println("getResult = " + getResult);
            Thread.sleep(2000);
//        Close the browser by using @AfterEach annotation



        }
        @Test
        public void subtractTest() throws InterruptedException {
            Faker faker = new Faker();
//        Navigate to  https://testpages.herokuapp.com/styled/index.html
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            Thread.sleep(1000);
//        Click on  Calculator under Micro Apps
            driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
            Thread.sleep(1000);
//        Type any number in the first input
            driver.findElement(By.id("number1")).sendKeys("8");
            Thread.sleep(1000);
//        Type any number in the second input
            driver.findElement(By.id("number2")).sendKeys("3");
            Thread.sleep(1000);
//        Select the options in dropdown
            WebElement timesOptions = driver.findElement(By.xpath("//*[@id='function']"));
            Thread.sleep(1000);
            Select select = new Select(timesOptions);
            Thread.sleep(1000);
            // select.selectByIndex("minus");
            select.selectByIndex(2);
            Thread.sleep(1000);
//        Click on Calculate
            driver.findElement(By.xpath("//*[@id='calculate']")).click();
            Thread.sleep(1000);
//        Get the result
            String getResult = driver.findElement(By.xpath("//*[@id='answer']")).getText();
            Thread.sleep(2000);
//        Verify the result
            Assertions.assertTrue(getResult.equals("5"));
            Thread.sleep(2000);
//        Print the result
            System.out.println("getResult = " + getResult);
            Thread.sleep(2000);
//        Close the browser by using @AfterEach annotation

        }
        @Test
        public void divisionTest() throws InterruptedException {
            Faker faker = new Faker();
//        Navigate to  https://testpages.herokuapp.com/styled/index.html
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            Thread.sleep(1000);
//        Click on  Calculator under Micro Apps
            driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
            Thread.sleep(1000);
//        Type any number in the first input
            driver.findElement(By.id("number1")).sendKeys("8");
            Thread.sleep(1000);
//        Type any number in the second input
            driver.findElement(By.id("number2")).sendKeys("2");
            Thread.sleep(1000);
//         Find the numbers of the options and list the all options
            List<WebElement> listOfDropdown = driver.findElements(By.xpath("//*[@id='function']"));
            int counter = 0;

            for (WebElement w : listOfDropdown){
                System.out.println(w.getText());
            }
            System.out.println("counter = " + counter);

//        Select the options in dropdown
            WebElement timesOptions = driver.findElement(By.xpath("//*[@id='function']"));
            Thread.sleep(1000);
            Select select = new Select(timesOptions);
            Thread.sleep(1000);
            // select.selectByIndex("divide");
            select.selectByValue("divide");
            Thread.sleep(1000);
//        Click on Calculate
            driver.findElement(By.xpath("//*[@id='calculate']")).click();
            Thread.sleep(1000);
//        Get the result
            String getResult = driver.findElement(By.xpath("//*[@id='answer']")).getText();
            Thread.sleep(2000);
//        Verify the result
            Assertions.assertTrue(getResult.equals("4"));
            Thread.sleep(2000);
//        Print the result
            System.out.println("getResult = " + getResult);
            Thread.sleep(2000);
//        Close the browser by using @AfterEach annotation

        }
    }

