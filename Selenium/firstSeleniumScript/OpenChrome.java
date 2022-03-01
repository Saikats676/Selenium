package Selenium.firstSeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome
{
    WebDriver driver;

    String url = "http://reallearning.in/";
    public void invokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\SAIKAT SAHA\\Libs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);

    }

    public void closeBrowser()
    {
        driver.close();   //Closes only the current tab

        driver.quit();   //Closes all the tabs or the agent
    }

    public static void main(String[] args)
    {
        OpenChrome oc = new OpenChrome();

        oc.invokeBrowser();
        oc.closeBrowser();

    }
}
