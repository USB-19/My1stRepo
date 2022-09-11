package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explixitlywait_fluentwait {

	public static void main(String args[]) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com");

		// identify and perform required operation
		driver.findElement(By.id("username")).sendKeys("admin");
		// type password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// click on login button
		driver.findElement(By.id("loginButton")).click();

		// fluent Wait declaration

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Home page title: "+driver.getTitle());

		
		
	}
	
	
}


/*
 * Wait wait=new FluentWait(WebDriver ref) 
  .withTimeout(timeout.SECONDS)
  .pollingEvery(timeout.SECONDS) 
  .ignoring(Exception.class); //OR 
  
  Wait wait=new FluentWait(WebDriver ref) 
  .withTimeout(Duration.ofSeconds(SECONDS))
  .pollingEvery(Duration.ofSeconds(SECONDS))  
  .ignoring(Exception.class);
 * 
 * 
 */
