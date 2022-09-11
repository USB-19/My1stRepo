package calander_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {
	
	public static void main(String args[]) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

	

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.manage().window().maximize();

		driver.get("https://erail.in/");
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("aura");
		driver.findElement(By.cssSelector("div[title='Aurangabad']")).click();
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("dada");
		driver.findElement(By.cssSelector("div[title='Dadar']")).click();
		
		driver.findElement(By.cssSelector("input[title='Select Departure date for availability']")).click();
		
		driver.findElement(By.cssSelector("#divCalender>center tbody>tr>td:nth-of-type(2)>.Month>tbody>tr:nth-of-type(6)>*:nth-child(2)")).click();
		//or
		//driver.findElement(By.cssSelector("td:nth-of-type(2) tr:nth-of-type(6)>*:nth-child(2)")).click();
		
		
		WebElement quotaDropdown = driver.findElement(By.id("cmbQuota"));
		
		Select quotaDropdownList = new Select(quotaDropdown);
		
		quotaDropdownList.selectByValue("TQ");
		
		 List<WebElement> availableTrainsNo = driver.findElements(By.cssSelector(" body #divMainWrapper .DataTable>tbody>tr>td[class='']>a[title='Click on train number to View fare and schedule']"));
		 //It also shows train no which are not available on specific day also
		 
		 
		 System.out.println("******************************");
		 
		 List<WebElement> availableTrainsName = driver.findElements(By.cssSelector(" body #divMainWrapper .DataTable>tbody>tr>td[style=';']>a"));
		 
		 System.out.println("******************************");
		 
		for(int i=0; i<availableTrainsNo.size(); i++) {
			
			System.out.println("Available Train : "+availableTrainsNo.get(i).getText()+" "+availableTrainsName.get(i).getText());
		}
		
		 
		 
		
}
}
