package org.PageObject;

import org.Browser.BrowExam;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj2 extends BrowExam {
    public PageObj2() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id='content']/nav")
    WebElement var1;
    public WebElement SaveText()
    {
        return var1;
    }
    @FindBy(xpath ="//*[@class='products columns-5']")
    WebElement var2;
    public WebElement SelectProductList()
    {
        return var2;
    }
}

