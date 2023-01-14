package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallel {

	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	public Capabilities cap;
	public WebDriver getDriver(){
		return driver.get();
	}
	
	@Test
	@Parameters({"browser"})
	public void doSearch(String browsers) throws MalformedURLException, InterruptedException{
		
		if(browsers.equalsIgnoreCase("firefox")){
			
			cap = new FirefoxOptions();
		}
		else if(browsers.equalsIgnoreCase("chrome")){
			cap = new ChromeOptions();
		}
		else if(browsers.equalsIgnoreCase("edge")){
			cap = new EdgeOptions();
		}
		
		driver.set(new RemoteWebDriver(new URL("http://localhost:4444"),cap));
		getDriver().get("http://google.com");
		getDriver().findElement(By.name("q")).sendKeys("Selenium Grid");
		Thread.sleep(3000);
		System.out.println("Title of page "+getDriver().getTitle());
		getDriver().quit();
	}
}
