package TestCaseWithSelenium4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestMultipleElementRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> lst = driver.findElements(RelativeLocator.with(By.tagName("label")).below(By.xpath("//h3[text()='Dummy Registration Form']")));
		for(WebElement l:lst){
			
			System.out.println(l.getText());
		}
	}

}
