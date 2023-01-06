package chromeDevTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v106.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBadSSL {

public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		DevTools tools = ((ChromeDriver) driver).getDevTools();
		tools.createSession();
		tools.send(Security.enable());
		tools.send(Security.setIgnoreCertificateErrors(true));
		driver.get("http://expired.badssl.com");
		

   }
}
