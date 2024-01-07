package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day07_Windows_WithTestBase extends TestBase {

    @Test
    public void windowsTest() throws InterruptedException {

//        Go to https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");

//        Assert if the window 1 title equals "The Internet"
        assertTrue(driver.getTitle().equals("The Internet"));
        Thread.sleep(2000);

//        Click on the link
        driver.findElement(By.linkText("Click Here")).click();
        // let get the handle of this window first
        String window1Handle = driver.getWindowHandle();
        System.out.println("window1Handle = " + window1Handle);
        Thread.sleep(2000);

        // New window opened but the driver is still on the previous window
        // so we have to switch first
//       driver.switchTo().window(); // at this point we don't have hashcode for the new window so we can't provide that in window()
        // so we use getWindowHandles() to get all hashcodes and then we loop through it.
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("allWindowHandles = " + allWindowHandles);  // returns all window handles / hashcodes

        // no need to create the loop again because now we have a reusable method
        // which takes care of the loop
        switchNewWindowByIndex(1); // switching window by index
//        switchNewWindowByTitle("New Window");  // switching window by title

//        Assert if the window 2 title equals "New Window"
        assertTrue(driver.getTitle().equals("New Window"));
        Thread.sleep(2000);

//
//        Switch back to window 1 title and assert if URL contains "windows"
        switchNewWindowByIndex(9);  // using reusable method

        Thread.sleep(2000);
        assertTrue(driver.getCurrentUrl().contains("windows"));
//        And assert if the URL doesn't contain 'new'
//        assertTrue(!driver.getCurrentUrl().contains("new")); // OR
        assertFalse(driver.getCurrentUrl().contains("new"));

//        Switch back to window 2
        switchNewWindowByIndex(1);
        Thread.sleep(2000);

//        Switch back to window 1
        driver.switchTo().window(window1Handle);
    }
}
