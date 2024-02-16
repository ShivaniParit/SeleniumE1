package javaexecuterscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillaPerticularElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/downloads/");
		
		 WebElement scrolltarget = driver.findElement(By.xpath("//h1[class='Downloads']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("argument[10],ScrollInView(false)",scrolltarget);
		
	}

}
