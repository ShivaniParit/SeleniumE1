package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/");
		
		WebElement passTB = driver.findElement(By.id("pass"));
		String passTF = passTB.getTagName(); 
           System.out.println(passTF );		
		
      		
	}

}