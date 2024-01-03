package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day05_Dropdown extends TestBase {

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
        // MONTH
        WebElement month = driver.findElement(By.cssSelector("#month"));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("6");// selecting month of july by its value

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
// HOMEWORK: State Test

//    Create a new test method stateTest() in this class
//    Then print the total number of states from the dropdown
//    Then print all states from the dropdown
//    Select 'Texas' option using one f the methods
//    Assert if 'Texas' is selected or not
//    Then check if state names are in alphabetical order or not


