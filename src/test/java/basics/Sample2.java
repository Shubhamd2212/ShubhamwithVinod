package basics;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.bytebuddy.utility.RandomString;

public class Sample2 {
	
	public static void dropdown(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
	
	public static void ss(WebDriver driver) throws Exception {
		
		String path=".png";
		String rm=RandomString.make(3);
		TakesScreenshot ts= (TakesScreenshot)driver;
		//File src=ts.getScreenshotAs(OutputType.BASE64);
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(path+rm+"\\script.png");
		
		FileUtils.copyFile(src, dest);
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.tagName("a"));
		WebElement element1=driver.findElement(By.tagName("a"));
		Select sel=new Select(element);
		
		List<WebElement>options=sel.getOptions();
	
		for(int i=0;i<options.size();i++) {
			
			String valu =options.get(i).getText();
			System.out.println(sel.getFirstSelectedOption()); 
			
			if (valu.equals("shubham")) {
				System.out.println(valu);
				sel.selectByVisibleText("Shubham");
				sel.selectByValue("Shubham");
				sel.selectByIndex(i);
				sel.isMultiple();
				break;
			}
		}
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		alt.dismiss();
		alt.equals(alt);
		alt.sendKeys("ok");
		
		String rm=RandomString.make(4);
		String path="D:\\Framework practice & project\\Workspace\\selenium2025\\Screenshots";
		TakesScreenshot ss=(TakesScreenshot)driver;
		File Src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+rm+"\\Test.png");
		
		
		String parent=driver.getWindowHandle();
	
		Set<String> all=driver.getWindowHandles();
		
		Iterator it=all.iterator(); 
		while (it.hasNext()) {
			String child=(String)it.next();
			
			if(!parent.equals(child)) {
				
				driver.switchTo().window(child);
			
			}
			
		}driver.switchTo().window(parent);
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		
		 js.executeScript("Window.scrollBy(0,500)", "");
		 
		 Actions act=new Actions(driver);
		 
		 
		 Actions act1=new Actions(driver);
		 act1.doubleClick(element);
		 act.contextClick(element);
		 act.clickAndHold(element);
		 //act1.sendKeys(act1.keyUp("parent")).build().
		 act.moveToElement(element).perform();
		 act.click(element).perform();
		 
		 act.contextClick(element).perform();
		 
		 act.clickAndHold(element).perform();
		 act.release(element).perform();
		 
		 act1.sendKeys(element,"Shubham").build().perform();
		 act1.sendKeys(Keys.DOWN.ENTER).perform();
		 act1.sendKeys(Keys.UP.ENTER).perform();
		 act1.keyDown(Keys.SHIFT).sendKeys("Shubham").keyUp(Keys.SHIFT).perform();
		 act1.keyDown(Keys.SHIFT).sendKeys("Shubham").keyDown(Keys.SHIFT).build().perform();
		 
		
		 Assert.assertEquals(element, element1, "both element not equals ");
		 Assert.assertFalse(false);
		 Assert.assertTrue(true);
		 Assert.assertTrue(false, "not expected ");
		 
		 String str=ExcelDprovider.GetStringData("Sheet1", 1, 1);
		 driver.findElement(By.tagName("a")).sendKeys(ExcelDprovider.GetStringData("Sheet1", 1, 1));
		 
	}

}
