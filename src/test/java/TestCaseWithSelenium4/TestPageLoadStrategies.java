package TestCaseWithSelenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageLoadStrategies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		//option.setPageLoadStrategy(PageLoadStrategy.NONE);//7124
		//option.setPageLoadStrategy(PageLoadStrategy.NORMAL);//27926
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);//12345
		long start = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.quit();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
