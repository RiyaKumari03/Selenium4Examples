package TestCaseWithSelenium4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestScreenshot {
	
	public static void main(String[] args) throws IOException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("trainer@way2automation.com");
		File aboveScreen = above.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(aboveScreen, new File("./screenshot/aboveScreen.jpg"));
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("New Delhi");
		File belowScreen = below.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(belowScreen, new File("./screenshot/belowScreen.jpg"));
		
	}

}
