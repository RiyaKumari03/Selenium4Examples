package TestCaseWithSelenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestRelativeLocator {

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select"))).sendKeys("trainer@way2automation.com");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select"))).sendKeys("New Delhi");
		driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin"))).click();
		driver.navigate().back();
		driver.findElement(RelativeLocator.with(By.xpath("//input[@name=\"password\"]")).toRightOf(By.tagName("label"))).sendKeys("ayjytyt");
		//driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("//input[@type=\"submit\"]"))).click();;
	    	    
	    // Password can be set using multiple xpaths
	    driver.findElement(RelativeLocator.with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
				.sendKeys("ksdfksfdsdf");
	    driver.findElement(By.linkText("Signin")).click();

	}
}
