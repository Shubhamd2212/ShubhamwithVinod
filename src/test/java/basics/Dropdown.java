package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath(""));
		
		Select sel=new Select(dropdown);
		sel.getFirstSelectedOption();
		sel.getOptions();
		sel.getAllSelectedOptions();
		sel.deselectAll();
		sel.hashCode();
		
		if(sel.isMultiple()) {
			System.out.println(sel.getAllSelectedOptions());
		}else {
			System.out.println("dropdown is not selected ");
		}
		
		List<WebElement>alldropdown=sel.getOptions();
		
		for(WebElement el:alldropdown) {
			System.out.println(el.getText());
		}
	}

}
