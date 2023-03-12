package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Pages.SmBazPage1;
import org.Pages.SmBazPage2;
import org.Pages.SmBazPage3;
import org.Screenshot.ScreenCopy;
import org.testng.Assert;

public class TestCase1 {
    @And("User enters the {string} data")
    public void user_enters_the_data (String string)
   /* @And("User enters the'rice' data")  //earlier error from testcase feature file....

    public void user_enters_the_rice_data()*/
    {
        SmBazPage1.SearchData(string);
    }
    @Then("User click on the search icon")
    public void user_click_on_the_search_icon()
    {
        SmBazPage1.ClickEnter();
    }
    @Then("User verifies the {string} results")
    public void user_verifies_the_results(String string)
    {
        try {
            ScreenCopy.TakeScreenShot(string);
            Assert.assertEquals(SmBazPage2.SaveText(),string);
        }
        catch (AssertionError e)
        {
            System.out.println(e);
        }
    }
    @And("Use selects the {string} product")
    public void use_selects_the_product(String string)throws InterruptedException
    {
        SmBazPage2.SelectProductList(string);
    }
    @When("user verifies the {string}  product results")
    public void user_verifies_the_product_results(String string)
    {
        try
        {
            Assert.assertEquals(SmBazPage3.SaveText(),string);
        }
        catch (AssertionError e)
        {
            System.out.println(e);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}