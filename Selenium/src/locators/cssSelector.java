package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//driver.findElement(By.cssSelector("html>body>div#page>div.container-fluid>div:nth-of-type(1)>*:first-child>*:nth-child(3)>*:first-child>div:nth-of-type(3)>*:first-child.button")).click();
				//or
		driver.findElement(By.cssSelector("html *:nth-child(3) div:nth-of-type(3)>*:first-child.button")).click();
	
	
	
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>div:nth-of-type(4)>*:first-child>*:nth-child(2)>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child.btn.btn-default.addButton.dropdown-toggle")).click();
	           
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>div:nth-of-type(4)>*:first-child>*:nth-child(2)>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child>*:nth-child(2)>*:first-child>*:first-child")).click();
	
		
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>div:nth-of-type(4)>*:first-child>*:nth-child(2)>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child.btn.btn-default.addButton.dropdown-toggle")).click();
        
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>div:nth-of-type(4)>*:first-child>*:nth-child(2)>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child>*:nth-child(2)>*:nth-child(2)>*:first-child")).click();
	
		

		driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>div:nth-of-type(4)>*:first-child>*:nth-child(2)>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child.btn.btn-default.addButton.dropdown-toggle")).click();
        
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>div:nth-of-type(4)>*:first-child>*:nth-child(2)>*:first-child>*:first-child>*:first-child>*:first-child>*:first-child>*:nth-child(2)>*:nth-child(3)>*:first-child")).click();
	
	
		driver.findElement(By.cssSelector ("i[title='Remove']")).click();
		driver.findElement(By.cssSelector ("button[data-bb-handler='confirm']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector ("i[title='Remove']")).click();
		driver.findElement(By.cssSelector ("button[data-bb-handler='confirm']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector ("i[title='Remove']")).click();
		driver.findElement(By.cssSelector ("button[data-bb-handler='confirm']")).click();
	
		driver.findElement(By.cssSelector("a.userName.dropdown-toggle.pull-right")).click();
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();	
		
		
		
	}
}
