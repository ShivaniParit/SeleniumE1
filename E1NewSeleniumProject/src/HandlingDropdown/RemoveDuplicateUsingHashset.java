package HandlingDropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingHashset {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shivani/Desktop/webelements/breakfast.html");
		
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		 
		 Select sel = new Select(multiSelectDD);
		 HashSet<String> hs = new HashSet<String>();
		 List<WebElement> options = sel.getOptions();
		 
		 for(int i=0; i<options.size(); i++)
		 {
			String ops = options.get(i).getText();
			 hs.add(ops);
			
		 }
//		 for(WebElement ele:options)
//		 {
//			String ops = ele.getText();
//			 hs.add(ops);
//		 }
		 System.out.println(hs);
	}
			
	
}
