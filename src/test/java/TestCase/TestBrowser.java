package TestCase;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://way2automation.com");
		System.out.println("Title "+driver.getTitle());
		driver.quit();
	}
}
