package Selenium.LocatorsAndIdentifiers;

public class MainLocatorsAndIdentifiers
{
    public static void main(String[] args)
    {
        LocatorsAndIdentifiers LAI = new LocatorsAndIdentifiers();

        LAI.invokeBrowser();
        LAI.login("mngr377298", "ysuzAbe");
        LAI.closeBrowser();
    }
}