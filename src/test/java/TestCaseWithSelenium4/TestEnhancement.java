package TestCaseWithSelenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEnhancement {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		int x = ele.getRect().getX();
		int y = ele.getRect().getY();
		
		Actions action = new Actions(driver);
		action.moveByOffset(x, y).click().perform();
		
	}
}
