package OperationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	private static final getOptions sel = null;
	private static final WebElement MultiselectDD = null;

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("file:///C:/Users/Shivani/Desktop/webelements/breakfast.html");
		driver.findElement(By.id("menu"));
		Select sel = new Select(MultiselectDD);
		boolean result = sel.isMultiple();
		System.out.println(result);
	}
		
		
		
		
		

	}

}
