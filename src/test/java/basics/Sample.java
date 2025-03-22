package basics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
	
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	 js.executeScript("document.getElementById('Enter id').value='text to be enter ;");
	 
	 js.executeScript("argument[0].click();", element);
	 js.executeScript("history.go(0)");
	 js.executeScript("return document.tittle;").toString();
	 js.executeScript("return document.URL;").toString();
	 js.executeScript("document.body.style.zoom='50%'");
	 
	}

}
