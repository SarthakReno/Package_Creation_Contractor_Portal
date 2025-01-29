package Reno_Contractor_Portal;

import Locators.LoginScreen;
import Utility.Constants;
import Utility.Functions;
import org.openqa.selenium.WebDriver;

import java.lang.module.Configuration;

public class login_main {
    public static Functions functionCall;
    public static WebDriver driver;
    public login_main(WebDriver driver) {
        login_main.driver = driver;
    }
    public static void main(String[] args) throws InterruptedException {
        functionCall = new Functions(driver);
        LoginScreen loginScreen = new LoginScreen(driver);

        Functions.MyChromeDriver();
        Functions.simpleWait(Constants.wait_2);
        loginScreen.Reno_Contractor_login();

    }
}