package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloAssignment {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://trello.com/home");
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("shivaniparit3@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shivanip@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
	    driver.findElement(By.xpath("//div[text()='E1']")).click();
	    driver.findElement(By.xpath("//a[text()='SQL']"));
	    driver.findElement(By.xpath("//a[text()='JAVA']"));
	    driver.findElement(By.xpath("//a[text()='MANUAL TESTING']"));
	    driver.findElement(By.xpath("//a[text()='SELENIUM']"));
	    driver.findElement(By.xpath("//a[text()='API']"));
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}
	

}
