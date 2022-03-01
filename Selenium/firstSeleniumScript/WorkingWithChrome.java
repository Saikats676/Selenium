package Selenium.firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome
{
    ChromeDriver driver;

    String url = "http://qatechhub.com";
    String url1 = "https://www.facebook.com";

    public void invokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\SAIKAT SAHA\\Libs\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();  //To maximize the window

        driver.get(url);
        this.isValidTitle();

        driver.get(url1);

        driver.navigate().back();   //To navigate back to the previous page

        String urlCur = driver. getCurrentUrl();
        System.out.println("Current URL;" + urlCur);

        driver.navigate().forward();   //To navigate forward to the previous page
        System.out.println("Current URL;" + urlCur);

        driver.navigate().refresh();   //To refresh the page
        System.out.println("Current URL;" + urlCur);
    }

    public void isValidTitle()
    {
        if(driver.getTitle().contains("QA Automation Tools Trainings and Tutorials"))
        {
            System.out.println("PASS");
        }
        else if(driver.getTitle().contains("QA Tech Hub"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }

    public void closeBrowser()
    {
        //driver.close();

        driver.quit();
    } 

    public static void main(String[] args) throws InterruptedException {
        WorkingWithChrome wwc = new WorkingWithChrome();

        wwc.invokeBrowser();
        Thread.sleep(20000);

        wwc.isValidTitle();
        wwc.closeBrowser();

    }

}
