package org.Pages;

import org.Browser.BrowExam;
import org.PageObject.PageObj2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
public class SmBazPage2 extends BrowExam
{
    static PageObj2 obj2;
   public static void SelectProductList(String item) throws InterruptedException
   {
        Thread.sleep(4000);
        List <WebElement> ProductsList = obj2.SelectProductList().findElements(By.xpath(".//li/div/div/div[3]/div[1]/h4/a"));
        Actions act = new Actions(driver);
        for (int i=0;i<ProductsList.size();i++)  //list product list created variable
        {
            String SearchData = ProductsList.get(i).getText(); // string SearchData from Page.1 line17
            if(SearchData.equalsIgnoreCase(item))
            {
                act.moveToElement(ProductsList.get(i)).click().build().perform();
                break;
            }
            //System.out.println(SearchData); //line 19
        }
    }
    public static String SaveText()
    {
        obj2 = new PageObj2();
        return obj2.SaveText().getText();
    }
}
