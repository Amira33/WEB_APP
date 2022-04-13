package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class SuccessfulOrder {


    @And("user agree with the terms of service")
    public void user_agree_with_the_terms_of_service()
    {
        Hooks.driver.findElement(By.id("termsofservice")).click();

    }

@Then("user could doing checkout")
    public void user_could_doing_checkout()
{

    Hooks.driver.findElement(By.id("checkout")).click();
}






}
