package TestCaseWithSelenium4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPrintToPDF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Pdf pdf = ((RemoteWebDriver) driver).print(new PrintOptions());
		Files.write(Paths.get("./selenium.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		
	}

}
