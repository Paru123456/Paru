package org.PageObject;

import org.Browser.BrowExam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj1 extends BrowExam
{
     public PageObj1()
     {
         PageFactory.initElements(driver, this);
     }
    @FindBy (name ="s")
    WebElement var;
     public  WebElement SearchData()
        {
        return var;
        }
        @FindBy (className = "aws-search-btn_icon")
        WebElement  click;
     public WebElement ClickEnter()
     {
         return click;
     }


}
