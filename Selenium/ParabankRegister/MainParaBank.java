package Selenium.ParabankRegister;

public class MainParaBank
{
    public static void main(String[] args) throws InterruptedException
    {
        RegisterCustomer rc =new RegisterCustomer();

        rc.invokeBrowser();
        rc.addCustomer();
        rc.Login();
        rc.closeBrowser();

    }
}
