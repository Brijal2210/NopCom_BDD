package org.example.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;   //declare the variable @driver@
    String browser = "Chrome"; // declare the browser here
    String baseURL = "https://demo.nopcommerce.com/";


    public DriverManager(){
        PageFactory.initElements(driver,this); // whenever we create object of this driver manager, it will initialize driver

    }


    //reusable methods here
   public void runOnLocalBrowser() throws IllegalAccessException {
       switch (browser){
           case "Chrome":
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
               break;
           case "edge":
               WebDriverManager.edgedriver().setup();
               driver= new EdgeDriver();
               break;
           case "safari":
               driver= new SafariDriver();
               break;
           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver=new FirefoxDriver();
               break;
           default:
               throw new IllegalAccessException("Unexpected browser");
       }
   }

   //Maximizing the browser method
    public void maxBrowser(){
       driver.manage().window().maximize();
   }

   // Open URL Method
    public void openURL(){
       driver.get(baseURL);
    }

    //for close the browser
    public void closeBrowser(){
       driver.quit();
    }

    //get current URL
    public String getCurrentURL(){
      return driver.getCurrentUrl();
    }
    //for wait
    public void sleepBrowser(int  ms) throws InterruptedException { // we should declare parameter here
        Thread.sleep(ms);
    }
    //
    public void applyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    // for get title
    public String getPageTitle() {
    return driver.getTitle();
    }
    }

