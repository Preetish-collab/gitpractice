package hooksTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;

public class hookssetUP {
    public static WebDriver driver;
    @Before("@Smoke")
    public void setup_browser() {

        System.out.println("Launch Browser");
    }


    @Before(order=2)
    public void setup_url() {
        System.out.println("Launch url");
    }


    @After(order=2)
    public void teardown_close() {
        System.out.println("Closing Browser");

    }

    @After("@Smoke")
    public void teardown_logout() {
        System.out.println("Logout application");
    }

    @BeforeStep
    public void takeScreeshot() {
        System.out.println("TakeScreenshot before each step");
    }
    @AfterStep
    public void refreshPage() {
        System.out.println("Refresh page after each step");
    }
}
