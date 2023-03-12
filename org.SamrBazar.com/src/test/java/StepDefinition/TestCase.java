package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.Browser.BrowExam;
import org.Pages.SmBazPage1;
import org.Screenshot.ScreenCopy;
import org.testng.Assert;
import org.testng.Reporter;

public class TestCase
{
    @Given("User open the browser")
    public void user_open_the_browser()
    {
        BrowExam.openBrowser();
    }
    @Then("User enter the URL {string}")
    public void user_enter_the_url(String string)  //first is data type and 2nd is varialbe    //www.smartbazaar.co.uk
    {
        BrowExam.openUrl(string); // URL is saved in string variable
    }

    @And("User verifies the title of the application")
    public void user_verifies_the_title_of_the_application()
    {
        ScreenCopy.TakeScreenShot("Test1");
            Assert.assertEquals(SmBazPage1.GetTitle(),"https://smartbazaar.co.com/");// to get error changed .co.uk to .com

    }
    @Then("User close the Browser")
    public void user_close_the_browser()
    {
        BrowExam.CloseBrowser();
    }

}
