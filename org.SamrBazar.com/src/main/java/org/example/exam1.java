package org.example;

import org.Browser.BrowExam;
import org.PageObject.PageObj2;
import org.Pages.SmBazPage1;
import org.Pages.SmBazPage2;
import org.Pages.SmBazPage3;
import org.openqa.selenium.remote.Browser;

public class exam1
{
    public static void main (String[] args) throws InterruptedException
    {
        BrowExam.openBrowser(); //  Browexam is another class name
        BrowExam.openUrl("https://www.smartbazaar.co.uk/");

        SmBazPage1.HandleCookies(); // another cookies code in BrowExam then comment this line. class date 24/2/2023
        SmBazPage1.SearchData(("flowers"));
        SmBazPage1.ClickEnter();

        SmBazPage2.SaveText();
        System.out.println(SmBazPage2.SaveText());
        SmBazPage2.SelectProductList("KTC SUNFLOWER OIL");

        System.out.println(SmBazPage3.SaveText());
        BrowExam.CloseBrowser();
    }
}
