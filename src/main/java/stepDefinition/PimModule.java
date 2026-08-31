package stepDefinition;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class PimModule {
    public static WebDriver driver;
        @When("I click on PIM link")
        public void i_click_on_pim_link() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(5000); // Wait for 5 seconds to ensure the page loads completely
            String title = driver.getTitle();
            System.out.println(title);


        }
        @Then("I check the PIM Module")
        public void i_check_the_pim_module() throws InterruptedException {

        }
}
