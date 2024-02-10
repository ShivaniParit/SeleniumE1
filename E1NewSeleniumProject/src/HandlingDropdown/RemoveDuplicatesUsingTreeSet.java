package HandlingDropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingTreeSet {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shivani/Desktop/webelements/breakfast.html");
		
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		 
		 Select sel = new Select(multiSelectDD);
		 
		TreeSet<String> ts= new TreeSet<String>();
		 List<WebElement> options = sel.getOptions();
		 
		 for(WebElement We: options) {
			String ops = We.getText();
			
			ts.add(ops);
		 }
		 System.out.println(ts);
		
	}

}
