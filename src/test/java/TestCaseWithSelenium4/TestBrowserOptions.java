package TestCaseWithSelenium4;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserOptions {

	public static void main(String[] args){
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("deviceName", "iPhone X");
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");//It will not open the browser
		//options.setAcceptInsecureCerts(true);//To accept the certification
		options.setExperimentalOption("excludeSwitches", 
				Collections.singletonList("enable-automation"));//disable the message chrome is automated
		options.addArguments("window-size=1400,1000");
		options.addArguments("incognito");
		options.setExperimentalOption("mobileEmulation", map);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver(options);
		//driver.get("http://expired.badssl.com");//Accept the certification
		driver.get("https://selenium.dev");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.getTitle());
		
		
		
	}
}
