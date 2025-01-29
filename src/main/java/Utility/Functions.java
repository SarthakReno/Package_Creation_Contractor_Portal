package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions {
    public static WebDriver driver;

    public Functions(WebDriver driver) {
    }

    public static void MyChromeDriver() {
        try {
            WebDriverManager.chromedriver().browserVersion("131.0.6778.70").setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize(); // for maximize the chrome screen
            // Navigate to a website Reno Admin
            driver.get("https://reno-test-contractor.azurewebsites.net/dashboard");
            System.out.println("Contractor Portal Launched");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Reno Admin app doesn't launch");
        }
    }

    // ****** For Print The Value ******
    public static void print(String val) {
        System.out.println(val);
    }

    // *******To_Provide_Wait************
    public static void simpleWait(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
