package Reno_Contractor_Portal;

import Utility.Functions;
import org.openqa.selenium.WebDriver;

public class login_main {
    public static Functions functionCall;
    public static WebDriver driver;
    public login_main(WebDriver driver) {
        login_main.driver = driver;
    }
    public static void main(String[] args) {
        functionCall = new Functions(driver);

        Functions.MyChromeDriver();
    }
}