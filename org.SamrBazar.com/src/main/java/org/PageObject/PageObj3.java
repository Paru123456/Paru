package org.PageObject;

import org.Browser.BrowExam;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj3 extends BrowExam {
    public PageObj3()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//div[@id='content']/nav")
    WebElement var3;
    public  WebElement SaveText()
    {
        return var3;
    }

}
