package TestCaseWithSelenium4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNewTabsAndWindows {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium 4");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://gmail.com");
		
		Set<String> winids = driver.getWindowHandles();
		System.out.println(winids.size());
		List<String> list = new ArrayList<String>();
		
		Iterator<String> iterator = winids.iterator();
		while(iterator.hasNext()){
			list.add(iterator.next());
		}
		
		driver.switchTo().window(list.get(0));
		System.out.println("First Window "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(list.get(1));
		System.out.println("Second Window "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(list.get(2));
		System.out.println("Third Window "+driver.getTitle());
		
		driver.close();
	}
}
