package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoMainMenu {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.cricinfo.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("wzrk-cancel")).click();
		
		//List<WebElement> cricinfoMainMenu = driver.findElements(By.cssSelector("html>body>*:first-child>#pane-main>#main-container>div:nth-of-type(2)>.ds-relative>*:first-child>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)>.ds-popper-wrapper"));
		//not work?
		List<WebElement> cricinfoMainMenu = driver.findElements(By.cssSelector(".ds-popper-wrapper>.ci-nav-hover"));
		
		//List<WebElement> cricinfoMainMenu = driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>div>a"));//correct locator
				
		for(int i=0; i<cricinfoMainMenu.size(); i++ ) {
			
			System.out.println("Cricinfo Main Menu : "+cricinfoMainMenu.get(i).getText());
			System.out.println("********************************");
			
			
			
		}
		
		System.out.println("********************************");
		
	}
	
}
