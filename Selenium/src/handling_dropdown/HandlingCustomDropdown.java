package handling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCustomDropdown {
	
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().window().maximize();

		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		
		
		// #bsd1-container div.dropdown-menu>div>a
		 
				WebDriverWait wait=new WebDriverWait(driver,20);
				WebElement dropdown=driver.findElement(By.id("bsd1-button"));
				wait.until(ExpectedConditions.elementToBeClickable(dropdown));
				//identify dropdown list and click on it
				dropdown.click();
				//identify all the options and store them into List<WebElement>
				List<WebElement> options=driver.findElements(By.cssSelector("#bsd1-container div.dropdown-menu>div>a"));
				//use size() to get option count
				System.out.println("option count: "+options.size());
				//use for loop to print one by one option
				for(int i=0;i<options.size();i++) {
					System.out.println(options.get(i).getText());
				}
				options.get(2).click();
				
				//for new selection need to click on dropdown again,
				
				dropdown.click();
				
				options.get(4).click();
			}

		
		
		
		
	

}
