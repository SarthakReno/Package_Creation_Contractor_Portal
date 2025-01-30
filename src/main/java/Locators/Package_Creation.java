package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Utility.Functions.print;
import Utility.Constants;
import Utility.Functions;

public class Package_Creation {
    public static WebDriver driver;
    public Package_Creation(WebDriver driver) {
        Package_Creation.driver = driver;
    }
    public void Contractor_Package_Creation() {
        By Package_section = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[3]/ul/div[3]"); // Xpath for package button comes in contractor portal
        By Create_Package_Button = By.xpath("/html/body/div/div[1]/div/div[2]/div/div/div[1]/button"); // Xpath for Create package button comes in contractor portal


        Functions.simpleWait(Constants.wait_2);
        try{
            if (Package_section!=null){
                Functions.driver.findElement(Package_section).click();
                print("The user was successfully click on the package section");
                Functions.simpleWait(Constants.wait_2);
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            print("************Test Case Fail*****************");
            print("The user was not able to click on the package section button");
        }
       try{
            if (Create_Package_Button!=null){
                Functions.driver.findElement(Create_Package_Button).click();
                print("The user was successfully click on the package creation button");
                Functions.simpleWait(Constants.wait_2);
            }
       }catch (RuntimeException e){
           e.printStackTrace();
       }catch (Exception e){
           print("************Test Case Fail*****************");
           print("The user was not able to click on the package creation button");
       }
    }
}
