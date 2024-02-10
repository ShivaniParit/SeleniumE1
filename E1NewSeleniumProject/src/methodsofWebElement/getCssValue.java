package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		 String CssValue = loginButton.getCssValue("background");
		 System.out.println(CssValue);
		 
		 String color = loginButton.getCssValue("color");
		 System.out.println(color);
		 
		

	}

}
