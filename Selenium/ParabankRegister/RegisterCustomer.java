package Selenium.ParabankRegister;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class RegisterCustomer
{
    ChromeDriver driver;
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    String Username = "Test" + System.currentTimeMillis() + "@xyz.com";
    String Password = "Pass" + System.currentTimeMillis() + "pw@abc#";

    public void invokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\SAIKAT SAHA\\Libs\\chromedriver.exe");
        driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get(url);
    }

    public void addCustomer() throws InterruptedException {
        driver.findElement(By.linkText("Register")).click();
        sleep(2000);
        driver.findElement(By.name("customer.firstName")).sendKeys("Ramu");
        sleep(1000);
        driver.findElement(By.name("customer.lastName")).sendKeys("Panda");
        sleep(1000);
        driver.findElement(By.name("customer.address.street")).sendKeys("25E, Banaras");
        sleep(1000);
        driver.findElement(By.name("customer.address.city")).sendKeys("Tokyo");
        sleep(1000);
        driver.findElement(By.name("customer.address.state")).sendKeys("JAPAN");
        sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("8971231");
        sleep(1000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
        sleep(1000);
        driver.findElement(By.name("customer.ssn")).sendKeys("987654321");
        sleep(1000);

        System.out.println("Username is:" + Username);
        System.out.println("Password is:" + Password);

        driver.findElement(By.name("customer.username")).sendKeys(Username);
        sleep(1000);
        driver.findElement(By.name("customer.password")).sendKeys(Password);
        sleep(1000);
        driver.findElement(By.name("repeatedPassword")).sendKeys(Password);
        sleep(1000);
        driver.findElement(By.className("button")).click();
        sleep(2000);
    }

    public void Login() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys(Username);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        sleep(5000);
    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
