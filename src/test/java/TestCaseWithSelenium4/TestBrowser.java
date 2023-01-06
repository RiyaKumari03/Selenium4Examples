package TestCaseWithSelenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.manager.SeleniumManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static String browser = "firefox";
	public static WebDriver driver;
	
public static void main(String[] args){
		
	    
		driver = new ChromeDriver();
		System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
		
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		driver.get("http://way2automation.com");
		System.out.println("Title "+driver.getTitle());
		driver.close();
		
	}
}
