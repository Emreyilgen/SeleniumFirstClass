package myfirstproject.Day_05;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day05_RadioButtontextBase extends TestBase {


    @Test
    public void radioButtonTest() {
//        Go to https://testcenter.techproeducation.com/index.php?page=radio-buttons
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");
//        Click on Red if not checked already
        WebElement red = driver.findElement(By.cssSelector("#red"));
        if (!red.isSelected()) {
            red.click();
        }
        // Verify if red is selected
        assertTrue(red.isSelected());
//        Click on Football if not checked already
        WebElement football = driver.findElement(By.cssSelector("#football"));
        if (!football.isSelected()) {
            football.click();
        }
    }
}