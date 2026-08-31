package stepDefinition;

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

public class HrmLoginTest {
    public static WebDriver driver;
    @Given("I am on the Orange HRM login page")
    public void i_am_on_the_orange_hrm_login_page() throws InterruptedException {
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


    @When("I enter valid {string} and {string}")
    public void iEnterValidAnd(String username, String password){
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }



    @And("I click on the login button")
    public void i_click_on_the_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);

    }
    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page() {
        driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        String title= driver.getTitle();
        System.out.println(title);

    }

    @Then("I click on PIM link")
    public void iClickOnPIMLink() {
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        WebElement ele= driver.findElement(By.xpath("//a[text()='Employee List']"));
        System.out.println(ele.isDisplayed());

    }



    @Then("I navigate to PIM module")
    public void iNavigateToPIMModule() {
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
    }

    @And("I verify client brand banner is visible")
    public void iVerifyClientBrandBannerIsVisible() throws InterruptedException {
        Thread.sleep(2000);
        WebElement brandlogo=driver.findElement(By.xpath("//img[@alt='client brand banner']"));
        if(brandlogo.isDisplayed()){
            System.out.println("Logo Verified");
        }
    }

    @And("I verify PIM is displayed on header section")
    public void iVerifyPIMIsDisplayedOnHeaderSection() {
        WebElement header=driver.findElement(By.xpath("(//*[text()='PIM'])[2]"));
        if(header.isDisplayed()){
            System.out.println("Header Verified");

        }
    }

    @Then("I navigate to Myinfo page")
    public void iNavigateToMyinfoPage() {
        driver.findElement(By.xpath("//span[text()='My Info']")).click();

    }


}
