package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	private static final WebElement loginButton = null;

	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
         driver.get("https://www.facebook.com/");
         
      boolean result = loginButton.isDisplayed();
          System.out.println( result );
         
         
      
		

	}

}
