package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import methodsofWebElement.getText;

public class FBSignUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement MonthDropdown = driver.findElement(By.id("month"));
		WebElement YearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select (dayDropdown);
		boolean result = daySelect.isMultiple();
		System.out.println(result);
		
		List<WebElement> dayOption = daySelect.getOptions();
		for(WebElement we: dayOption) {
			
			System.out.println(we.getText());
			
		}
		
		daySelect.selectByIndex(16);
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		
		Select monthSelect = new Select(MonthDropdown);
		     boolean result2 = monthSelect.isMultiple();
		     System.out.println(result2);
		     
		     List<WebElement> monthOption =monthSelect.getOptions();
		     for(WebElement we: monthOption) {
		    	 System.out.println(we.getText());		    	 
		     }
		     monthSelect.selectByIndex(8);
		     System.out.println("------------------------------------------------------------");
		     System.out.println();
		     
		   Select yearSelect = new Select(YearDropdown);
		   boolean result3 = yearSelect.isMultiple();
		   System.out.println(result3);
		   
              List<WebElement>yearOption = yearSelect.getOptions();	
              for(WebElement we:yearOption) {
            	  System.out.println(we.getText());
            	  
              }
              
              yearSelect.selectByIndex(9);
              System.out.println("---------------------------------------------------------");
              System.out.println();
                         
		     
		
		  		

	}

}
