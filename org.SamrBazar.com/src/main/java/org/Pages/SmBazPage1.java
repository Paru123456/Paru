package org.Pages;

import org.Browser.BrowExam;
import org.PageObject.PageObj1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SmBazPage1 extends BrowExam // super class inhearting

{
    static PageObj1 obj1; //class name  and object is obj1 (new class name)
    public static void HandleCookies() throws InterruptedException
    {
        Thread.sleep(4000);
        WebElement move = driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")); //Accept cookies
        Actions act = new Actions(driver);
        act.moveToElement(move).click().build().perform();
    }

public static void SearchData(String data) //website> Home page >>Search bar
 {
     obj1=new PageObj1();
    obj1.SearchData().sendKeys(data);
 }
 public static void ClickEnter()
 {
    obj1.ClickEnter().submit();
    //Home page search Button
 }
public static String GetTitle(){
        return driver.getTitle();
}

}
