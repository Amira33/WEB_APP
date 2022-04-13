package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class Search_04 {



    @And("user click to search")
    public void user_click_to_search()
    {
        Hooks.driver.findElement(By.id("small-searchterms")).click();
    }

    @When("user search with the name of the product")
    public void  user_search_with_the_name_of_the_product()
    {
        //****** for search of camera **********//

        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("camera");
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
    }


    @Then("user is able to find what lookig for")
    public void user_is_able_to_find_what_lookig_for()
    {


       int productCount = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();    // count of the product
        System.out.println("productCount =   " + productCount);                                             // print it on run screen


       Assert.assertTrue( productCount>0 );
        ArrayList<String> prodouctlist = new ArrayList <String> () ;                                           // make object of array

       for (int y=0 ; y < productCount ; y++)                                                           // for loop initial of 0
        {
            Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(y).getText();
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(y).getText());
           prodouctlist.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(y).getText());
            // first assertion to check the text
           Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(y).getText().toLowerCase().contains("camera"));


            //soft Assertion

            SoftAssert soft = new SoftAssert();

            // First ASSERTION to check photo of the product
//            System.out.println("First ASSERTION check photo of the product");
//            soft.assertTrue(Hooks.driver.findElement(By.cssSelector("[alt=\"Picture of Leica T Mirrorless Digital Camera\"]")).isDisplayed(),"first assertion photo ");

            // second ASSERTION to check ADD to cart button
            System.out.println("second ASSERTION Add to cart button");
            soft.assertTrue(Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]")).isDisplayed(),"second assertion ADD TO CART  ");

            // Third assertion of url link of search successfully
            System.out.println("Third ASSERTION url of the product");
            soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=camera","third assertion of url of the product");


            // Assert ALL
            soft.assertAll();

        }
      System.out.println(prodouctlist);
    }


    /////////////////// second scenario user search using the categories for example Jewelry

    @When("user search using the categories for example Jewelry")
    public void search_for_jewelry()
    {
        Hooks.driver.findElement(By.cssSelector("[href=\"/jewelry\"]")).click();
    }




@Then("user is able to find what lookig for from categories")
    public void find_category_products()
    {

        int productCount = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();    // count of the product
        System.out.println("productCount =   " + productCount);                                                               // print it on run screen


        Assert.assertTrue( productCount>0 );
        ArrayList<String> prodouctlist = new ArrayList <String> () ;                                   // make object of array

        for (int y=0 ; y < productCount ; y++)                                                  // for loop initial of 0 to check the product count

        {

        }

             // soft Assertion

            SoftAssert soft = new SoftAssert();

            // First ASSERTION to check photos of the product
            System.out.println("First assertion to  check photo of the product");
            soft.assertTrue(Hooks.driver.findElement(By.className("category-page")).isDisplayed(),"first assertion of photos ");



            // Second  assertion of url link of search successfully
            System.out.println("Third assertion to check  url of the product");
            soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/jewelry","second assertion of url of the product");


            // Assert ALL
            soft.assertAll();


       System.out.println("\n  your assertion is correct \n  Test scenario is done correctly" );



    }


}
