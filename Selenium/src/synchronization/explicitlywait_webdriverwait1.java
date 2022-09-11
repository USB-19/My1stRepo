package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitlywait_webdriverwait1 {

	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("shailesh13.de");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//explicit wait(dynamic wait)
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		//add condition to wait using WebDriverWait instance
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
		
		driver.findElement(By.name("Passwd")).sendKeys("abc@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//close the browser
		//driver.close();
		
	
		
		
	}
	

}
