package TestCaseWithSelenium4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFullPageScreenshot {

	public static void main(String[] args) throws IOException{
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://qa.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		File pageScreen = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageScreen, new File("./screenshot/pageScreen.jpg"));
		
		File pageFullScreen = driver.getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageFullScreen, new File("./screenshot/pageFullScreen.jpg"));
		
		
	}
}
