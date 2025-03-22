package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert {

	@Test
	public static void alert() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
	
		//Thread.sleep(2000);
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(1);
		
		
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("\"//button[text()='Try it']\"")));
		wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//button[text()='Try it']")));
		
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		org.openqa.selenium.Alert alt=driver.switchTo().alert();
		String str=alt.getText();
		System.out.println(str);
		
		alt.accept();
		
	}
	
	
	
}
