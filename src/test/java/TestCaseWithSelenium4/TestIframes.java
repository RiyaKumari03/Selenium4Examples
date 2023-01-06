package TestCaseWithSelenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframes {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_iframe_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='Run ❯']")).click();
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		driver.findElement(By.id("navbtn_menu")).click();
		driver.switchTo().parentFrame();
		
	}
}
