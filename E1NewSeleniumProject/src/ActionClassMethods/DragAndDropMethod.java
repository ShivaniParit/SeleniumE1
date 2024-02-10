package ActionClassMethods;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
	
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		WebElement mobilechargersource = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement laptopchargersource = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement moilecoverresouce = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement laptopcoverresouce = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement laptopacc = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		WebElement mobileacc = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
        Actions act = new Actions(driver);		
        
        act.dragAndDrop(mobilechargersource, mobileacc).perform();
        act.dragAndDrop( laptopchargersource,laptopacc ).perform();
        act.dragAndDrop(moilecoverresouce, mobileacc).perform();
        act.dragAndDrop(laptopcoverresouce, laptopacc).perform();
        
		
		
		
	}

}
