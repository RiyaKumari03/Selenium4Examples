package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestRemote {
 
	@Test
	public void main() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		FirefoxOptions options = new FirefoxOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.quit();
		
	}

}
