package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Wishlist_06 {

    @And("user has an empty wishlist")
    public void user_has_an_empty_wishlist()
    {

        Hooks.driver.findElement(By.className("wishlist-label")).click();
        System.out.println("You have no items in your Wishlist");


    }


   @When("user click the add the product to wishlist")
    public  void user_click_the_add_the_product_to_wishlist()
   {
       Hooks.driver.findElement(By.className("add-to-wishlist-button")).click();
       System.out.println("you click this button to add the product to the wishlist");

   }

   @Then("The wishlist is displayed the item added")
    public void The_wishlist_is_displayed_the_item_added()
   {

      // soft assertion


       SoftAssert soft = new SoftAssert();

       // first ASSERTION

       System.out.println("first ASSERTION");
       soft.assertTrue( Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]")).isDisplayed(),"first assertion ");


       // second ASSERTION

       System.out.println("second ASSERTION");
       Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]")).click();
       soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/wishlist"),"second assertion");

       // Third ASSERTION

       System.out.println("Third ASSERTION");
       soft.assertTrue( Hooks.driver.findElement(By.id("updatecart")).isDisplayed(),"Third assertion ");


       // forth assert
       System.out.println("another assert");
       soft.assertTrue( Hooks.driver.findElement(By.className("wishlist-add-to-cart-button")).isDisplayed(),"forth assertion ");




       // Assert ALL
       soft.assertAll();
   }



}
