package methodsOfWebDriver;

import java.util.Scanner;
import java.awt.datatransfer.SystemFlavorMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP {
	
	static WebDriver driver;

	public static void main(String[] args)throws InterruptedException {
		System.out.println("Enter the Browser Name");
		
	  Scanner sc = new Scanner(System.in);
	  String browserValue = sc.next();
	  
     if(browserValue.equalsIgnoreCase("Chrome"))
     {
    	 System.setProperty("webdriver.chrome.driverr","./drivers/chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 Thread.sleep(3000);
    	driver.close();
     }
    	 else if (browserValue.equalsIgnoreCase("firefox"))
    	 {
    		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    		driver = new FirefoxDriver();
    		driver.manage().window().maximize();
    		Thread.sleep(3000);
    		driver.close();
    	 }
    	 else if (browserValue.equalsIgnoreCase("edge"))
    	 {
    		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    		driver = new EdgeDriver();
    		driver.manage().window().maximize();
    		Thread.sleep(3000);
    		driver.close();
     }
	}
}
     
		// TODO Auto-generated method stub

	
