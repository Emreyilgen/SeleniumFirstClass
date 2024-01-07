package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day07_Dropdown_WithTestBase extends TestBase {

    /*
    - Dropdown is a list of webElements
    - How to select from a dropdown?
            We can use 3 ways to select from a dropdown: byIndex, byValue and byVisibleText
    - How to get selected option from a dropdown? (For Verification purpose)
    - we use getFirstSelectedOption() method

     */

    @Test
    public void dropdownTest() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        // choose your birthdate 2000-07-07

        //YEAR
        // step 1: locate the dropdown
        WebElement year = driver.findElement(By.id("year"));
        // step 2: create object from select Class and assign the webElement to it
        Select selectYear = new Select(year);
        // step 3: Now we have the select object, now we can interact with the dropdown
        selectYear.selectByVisibleText("2000");  // selecting the year by visible text

//        // MONTH
        WebElement month = driver.findElement(By.cssSelector("#month"));
        Select selectMonth = new Select(month);
//        selectMonth.selectByValue("6");// selecting month of july by its value


//      selecting month dropdown using REUSABLE MERHODS from testbase ( use any one of the followings)
        dropdownSelectByIndex(month, 6); // (line38)

        dropdownSelectByIndex(driver.findElement(By.id("#month")), 6);  // locator and index (test base class line 46 method)
        dropdownSelectByIndex(driver.findElement(By.cssSelector("#month")), 6);  // locator and index (test base class line 46 method)

        dropdownSelectByIndex("//select[@id='month']", 6); // xpath and index (test base class line 52 method)


        // DAY
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(6);


        //assert that year 2000 is selected
        WebElement selectedyear = selectYear.getFirstSelectedOption(); // returns the options that we selected (sent for years)
//        System.out.println("selectedyear = " + selectedyear.getText());

        assertTrue(selectedyear.getText().contains("2000")); // asserting verifing if the selected year as the same as expected

        // get all months from the dropdown and assert that "october" is an option in the months
        List<WebElement> allMonths = selectMonth.getOptions();  // returns all web elements int he dropdown list
        for (WebElement w : allMonths) {
            System.out.println("w.getText() = " + w.getText());

            boolean flag = false; // declare a boolean variable to use for assertion
            if (w.getText().contains("October")) {
                flag = true;
            }
            assertTrue(flag);
        }
    }
}



