package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uniqueattribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(5000);
		
		WebElement signin = driver.findElement(By.xpath("//input[@name='emailId']"));
		signin.sendKeys("shivaniparit3@gmail.com");
		Thread.sleep(2000);
		
		 WebElement password = driver.findElement(By.xpath("//input[@id='mui-2']"));
		 password.sendKeys("Shivani@123");
		 
		 WebElement signinbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		 signinbtn.click();
		
		
	


	}

}
