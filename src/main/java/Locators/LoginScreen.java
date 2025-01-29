package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Utility.Functions.print;
import Utility.Constants;
import Utility.Functions;

public class LoginScreen {
    public static WebDriver driver;
    public LoginScreen(WebDriver driver) {
        LoginScreen.driver = driver;
    }
    public void Reno_Contractor_login() throws InterruptedException {

        By Contractor_email_id = By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/input"); // Contractor Portal User's Email_ID xpath
        By Contractor_password = By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/input"); // Contractor Portal User's Login password xpath
        By Continue_button = By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[3]/button"); // Contractor Login screen

        Functions.simpleWait(Constants.wait_2);
        print("Contractor Login Screen Open");
        // Checking Email_ID Section
        try {
            if (Contractor_email_id!=null){
                Functions.driver.findElement(Contractor_email_id).sendKeys(Constants.Email);
                print("The User Successfully Entered The Email_id");
                Functions.simpleWait(Constants.wait_3);
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            print("**********Test Case Fail*************");
            print("The user was not able to give the Email_id");
        }
        // Checking Password Section
        try{
            if (Contractor_password!=null){
                Functions.driver.findElement(Contractor_password).sendKeys(Constants.Password);
                print("The User Successfully Entered The Password");
                Functions.simpleWait(Constants.wait_3);
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            print("**********Test Case Fail*************");
            print("The user was not able to give the Password");
        }
        // Checking Continue Button
        try{
            if (Continue_button!=null){
                Functions.driver.findElement(Continue_button).click();
                print("The User Successfully click on the continue button");
                Functions.simpleWait(Constants.wait_3);
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            print("**********Test Case Fail*************");
            print("The user was not able to click on the continue button");
        }
    }
}
