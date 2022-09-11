package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		System.out.println("****************************************************");

		Thread.sleep(4000);

		driver.findElement(By.name("q")).sendKeys("SHIRO");

		System.out.println("****************************************************");

		// Thread.sleep(2000); sometimes shows error if wait not given

		List<WebElement> googleSuggestion = driver
				.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));

		for (int i = 0; i < googleSuggestion.size(); i++) {

			System.out.println(googleSuggestion.get(i).getText());

		}

	}
}