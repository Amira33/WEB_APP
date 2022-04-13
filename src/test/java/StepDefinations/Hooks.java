package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;


   // static LoginPage login;

    @Before
    //@Given("user open the url chrome browser")
    public static void  open_url_chrome_browser() throws InterruptedException {

        //******** setup web driver manager***********

        WebDriverManager.chromedriver().setup();

        // String chromepath = System.getProperty("user.dir") + "/src/main/resources/chromedriver 2";
        // System.out.println(chromepath);
        // System.setProperty("webdriver.chrome.driver", chromepath);

        // ********** new object Of WebDriver ********
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     // check for the element

        // ******** Navigate to  website and maximize screen and sleep**********

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);



        //////////////////////// navigate the driver to website
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

        //////////////////////create new object of loginpage

       // login = new LoginPage(driver);


    }




    @After
    // @And("user quit the driver")
    public static void user_quit_the_driver() throws InterruptedException
    {
        Thread.sleep(5000);
        driver.quit();
    }

}
