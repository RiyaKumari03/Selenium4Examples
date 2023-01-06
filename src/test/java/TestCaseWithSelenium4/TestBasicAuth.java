package TestCaseWithSelenium4;

import java.time.Duration;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet-herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

}
