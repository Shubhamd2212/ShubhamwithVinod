package basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	
	public void test1() {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		String str=driver.findElement(By.id("user-name")).getAttribute("Value");
//		String id=driver.findElement(By.id("user-name")).getAttribute("id");
//		String src=driver.findElement(By.id("user-name")).getAttribute("src");
//		String dis=driver.findElement(By.id("user-name")).getAttribute("disabled");
//		System.out.println("Attribute value "+str);
//		System.out.println("Attribute value id : "+id );
//		System.out.println("Attribute value src  : "+ src);
//		System.out.println("Attribute value dis  : "+ dis);
		
		driver.findElement(By.id("login-button")).click();
		 String currentwin=driver.getWindowHandle();
		System.out.println(currentwin);
		driver.switchTo().window(currentwin);
		
		List<WebElement> listsauce=driver.findElements(By.partialLinkText("Sauce"));
		
		System.out.println(listsauce.size());
		for(WebElement ele:listsauce) {
			System.out.println(ele.getText());
		}
		
		String current=driver.getWindowHandle();
		
		driver.switchTo().window(current);
		Set<String>Allwindow=driver.getWindowHandles();
		System.out.println(Allwindow);
		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		
		//driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();	
		
		
		//driver.findElement(By.xpath("//div[@class='cart_item']")).isDisplayed();
		List<WebElement> alllink=driver.findElements(By.tagName("a"));
	
		System.out.println("Link size  : "+alllink.size());
		for(WebElement e:alllink) {
			System.out.println("link text : "+e.getText());
		}
		
		
		
		
		driver.close();
		
	}
	
	
	
	
	
}
