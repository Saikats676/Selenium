package Selenium.LocatorsAndIdentifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAndIdentifiers
{
    ChromeDriver driver;
    String url = "http://demo.guru99.com/v4/";

    public void invokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\SAIKAT SAHA\\Libs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();  //To maximize the window
        driver.manage().deleteAllCookies();

        driver.get(url);
    }

    public void login(String username, String password)
    {
        WebElement unE = driver.findElement(By.name("uid"));
        unE.sendKeys(username);

        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
    }

    public void closeBrowser()
    {
        driver.quit();
    }
}
