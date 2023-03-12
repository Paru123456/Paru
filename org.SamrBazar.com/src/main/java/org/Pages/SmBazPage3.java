package org.Pages;

import org.Browser.BrowExam;
import org.PageObject.PageObj3;
import org.openqa.selenium.By;

public class SmBazPage3 extends BrowExam
{

    static PageObj3 obj3;
    public static String SaveText() throws InterruptedException {
        Thread.sleep(2000);
        obj3 = new PageObj3();
        return obj3.SaveText().getText();
    }
}
