package TestCaseWithSelenium4;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWebElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(5))
				.withTimeout(Duration.ofSeconds(10))
				.withMessage("Time out expire")
				.ignoring(NoSuchElementException.class);
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Passwd']"))).sendKeys("absab");
		
		//driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("abs");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		System.out.println(driver.findElement(
				By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/div[1]/div[2]/div[2]/span")).getText());
	}
}
