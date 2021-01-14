package selenium_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commands {

	public static void main(String[] args) {
		
		// Open or Instantiate a Web Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		  System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Selenium\\Drivers\\geckodriver.exe"); 
		  WebDriver FF = new FirefoxDriver();
		  
		  System.setProperty("webdriver.edge.driver", "E:\\Softwares\\Selenium\\Drivers\\msedgedriver.exe");
		  WebDriver edge = new EdgeDriver();
		 
		
		// Close or Quit Web Browser
		// driver.close(); // This will close the current active window of the current instance
		// driver.quit(); // This will close all the active windows of the current instance
		
		// Navigation Commands
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// Get Commands
		driver.get("URL");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getWindowHandle();
		
		// Handling Elements
		driver.findElement(By.id("")).sendKeys("Abhishek");
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).clear();
		
	}

}
