package org.Screenshot;

import org.Browser.BrowExam;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.File;

import static org.Browser.BrowExam.driver;

public class ScreenCopy extends BrowExam {
    public static void TakeScreenShot(String name) {


        try {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);

            File Src = scrShot.getScreenshotAs(OutputType.FILE); // obj will store in src

            String filePath = System.getProperty("user.dir") + "//target//Screenshot" + name + ".png";
            File Dest = new File(filePath);
            FileUtils.copyFile(Src, Dest);
        } catch (Exception e) {
            System.out.println("Screen Captured");
        }
    }
}
