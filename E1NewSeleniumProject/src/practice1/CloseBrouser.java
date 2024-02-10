package practice1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrouser {

	public static void main(String[] args) throws InterruptedException {

      System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
      
     ChromeDriver driver =  new ChromeDriver();
     Thread.sleep(5000);
     driver.close();
	}

}
