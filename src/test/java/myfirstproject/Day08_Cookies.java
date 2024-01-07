package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day08_Cookies extends TestBase {
    @Test
    public void cookieTest() throws InterruptedException {
//        Go to amazon  https://www.amazon.com/
        driver.get("https://www.youtube.com/");
        Thread.sleep(1000);
        driver.navigate().refresh(); // refresh here to get rid o captcha
//        Find the total number of cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Total Cookies = " + allCookies.size());
//        Print all the cookies
        for (Cookie eachCookie : allCookies){
            System.out.println("each Cookie = " + eachCookie);
            System.out.println("each Cookie Name = " + eachCookie.getName());
            System.out.println("each Cookie Value = " + eachCookie.getValue());
        }
        System.out.println("******************");
//        Get the cookies by their name
        System.out.println("Cookies by name = " + driver.manage().getCookieNamed("VISITOR_PRIVACY_METADATA"));
//        Add new cookie
        Cookie myFavCookie = new Cookie("myCookies", "login-detail2024");
        driver.manage().addCookie(myFavCookie);
        Thread.sleep(3000);
        for (Cookie each :driver.manage().getCookies() ){
            System.out.println("each = " + each);
        }
        System.out.println("******************");
//        Delete all cookies
        driver.manage().deleteCookieNamed(myFavCookie.toString()); // this will delete one given cookie
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        System.out.println("After deleting all cookies, there are "+ driver.manage().getCookies().size() + " cookies left");

    }
}
