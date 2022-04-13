package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class SwitchCurrencies_08 {


@And("user click the switch currencies")
    public void user_click_the_switch_currencies()
{
    Hooks.driver.findElement(By.id("customerCurrency")).click();
}

@Then("Different currencies appears choosen US")
    public void Different_currencies_appears ()
{

    SoftAssert soft = new SoftAssert();
    Hooks.driver.findElement(By.cssSelector("[value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F\"]")).click();



    Hooks.driver.navigate().refresh();

    System.out.println(" All products are in Us currencies");
    soft.assertTrue( Hooks.driver.findElement(By.className("home-page-product-grid")).isDisplayed());



    // Assert ALL
    soft.assertAll();

}



@And("user choosed Euro")
        public void user_choosed_Euro()
    {
        SoftAssert soft = new SoftAssert();
        Hooks.driver.findElement(By.cssSelector("[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).click();


        Hooks.driver.navigate().refresh();

        System.out.println(" All products are in Euro currencies");
        soft.assertTrue( Hooks.driver.findElement(By.className("home-page-product-grid")).isDisplayed());


        // Assert ALL
        soft.assertAll();


    }


}

