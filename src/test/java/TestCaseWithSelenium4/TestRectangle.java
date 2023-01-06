package TestCaseWithSelenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRectangle {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"headingText\"]/span"));
		Rectangle rec = ele.getRect();
		System.out.println("Height "+rec.getHeight());
		System.out.println("Width "+rec.getWidth());
		System.out.println("x location "+rec.getX());
		System.out.println("y location "+rec.getY());
		
	}

}
