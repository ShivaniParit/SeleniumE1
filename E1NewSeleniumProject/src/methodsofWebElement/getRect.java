package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");
		
		 WebElement passTB = driver.findElement(By.name("email"));
		 Rectangle reactangle = passTB.getRect();
		 System.out.println(reactangle.getHeight());
		 
		 System.out.println(reactangle.getWidth());
		 
		 System.out.println(reactangle.getX());
		 System.out.println(reactangle.getY());
		

	}

}
