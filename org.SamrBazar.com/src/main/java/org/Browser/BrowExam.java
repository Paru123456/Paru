package org.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.net.URL;

public class BrowExam
{
    public static WebDriver driver;
    public static Actions act;
    public static String fileProperties(String propertiesData)//browser
    {
        String returnData = null;  // variable
        try
        {
            String filelocation = System.getProperty("user.dir") + "//src//main//resources//Configuration//First.properties";
            File file = new File(filelocation);
            FileInputStream fileinput = new FileInputStream(file); // file input object name of fileinputstream line 22 file strem
            Properties prop = new Properties(); // creating object
            prop.load(fileinput); // prop is object referring to my file
            returnData = prop.getProperty(propertiesData); //get property is for read data
        }
        catch(Exception e)
        {
            System.out.println("Properties" + e);
        }
        return returnData;
    }
    public static void openBrowser()
    {
        String choice = BrowExam.fileProperties("Browser"); //Accept argument - from  First.properties
        if (choice.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (choice.equalsIgnoreCase("Edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

    }
        public static void openUrl(String URL)
    {
        driver.get(URL);
        // driver.findElement(By.linkText("Accept")).click(); // Cookies accept another method>see for 1st method SmBazPage1.
    }
    public static void CloseBrowser()
    {
        driver.quit();
    }
}
