package myfirstproject.Day_06;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day06_Iframes extends TestBase {




    @Test
    public void iframeTest(){

// Go to https://testpages.herokuapp.com/styled/frames/frames-test.html

    driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");

//    Then Assert that "Left List Item 29" is the last element
   //     Left list item 29 element is inside
                driver.switchTo().frame(1);  // by index
                //driver.switchTo().frame("left");  // by name or id
                //driver.switchTo().frame("//frame[@name='left']");  // by xpath
        //NOW WE ARE INSINE THE IFRAME

        //driver.findElement(By.id("left29")).isDisplayed();
        //driver.findElement(By.id("//li[@id='left']"));  // hard way of testing if last item in the list is "list29"
        String lastElement = driver.findElement(By.xpath("//li[last()]")).getText(); // last() return the last element everytime.
        // this way the xpaht is more dynamic.
        System.out.println("lastElement = " + lastElement);
        Assertions.assertTrue(lastElement.equals("Left List Item 29"));


//    And Assert that "Middle List Item 39" is the last element in the "Middle"
     //   at thispoint, driver is inside the "left" frame we need to switch to parent frame
    //            or default page level to switch ti the "middle" frame

        driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent();
        driver.switchTo().frame("middle"); // switching to the middle frame
        // now locate the last item
        String middleFrameFastItem = driver.findElement(By.xpath("//li[last()")).getText();
        System.out.println("middleFrameFastItem = " + middleFrameFastItem);
        Assertions.assertTrue(middleFrameFastItem.equals("Middle List Item 39"));


    }
}
