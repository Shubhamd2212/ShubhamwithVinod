package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dargndrop {

	
		// TODO Auto-generated method stub

		
		@Test
		public  void drop() {
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.dhtmlgoodies.com/scripts/index.html?page=dragDrop");
			driver.manage().window().maximize();
		
			Actions act =new Actions(driver);
		
			WebElement source=driver.findElement(By.xpath("//a[text()='Drag and drop']"));
			WebElement destination=driver.findElement(By.xpath("//input[@type='text']"));
			
			
			act.dragAndDrop(source, destination);
			
			
			WebElement move=driver.findElement(By.xpath("//input[@value=\"Search\"]"));
			
			act.moveToElement(move).click().build().perform();
			
			//act
			
	}

}
