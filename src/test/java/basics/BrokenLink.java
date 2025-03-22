package basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		int rescode=200;
		int brokenLinkcount=0;
		List<WebElement> alllink=driver.findElements(By.tagName("a"));
		
		for(WebElement ele:alllink) {
		
			ele.getText();
			String url=ele.getAttribute("href");
			try{
			URL urllink=new URL(url); //Converts the url string into a URL object. This object is required to open a connection to the link.
			
			HttpURLConnection huc=(HttpURLConnection)urllink.openConnection();
			
			huc.connect();
			 rescode=huc.getResponseCode();
			
			 if(rescode>=400) {
				 System.out.println(url +" : broken links ");
				 brokenLinkcount++;
			 }
			
			
				
			}catch(MalformedInputException e) { // Catches the MalformedInputException if the URL is not well-formed. However, this exception is rarely encountered here, as MalformedInputException is generally related to character encoding, not URLs.
				
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}System.out.println("count of broken links : "+ brokenLinkcount);
		
		driver.close();
	}

}
