package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMainMenu {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		System.out.println("****************************************************");

		Thread.sleep(4000);

		driver.findElement(
				By.cssSelector("html>body>div:nth-of-type(2)>*:first-child>*:first-child>*:first-child._2KpZ6l"))
				.click();

		// List <WebElement> mainmenu =
		// driver.findElements(By.cssSelector("div[class='eFQ30H']"));

		List<WebElement> mainmenu = driver.findElements(By.className("eFQ30H"));

		for (int i = 0; i < mainmenu.size(); i++) {

			WebElement element = mainmenu.get(i);
			System.out.println(element.getText());
			// or
			// System.out.println(mainmenu.get(i).getText());

			System.out.println("****************************************************");

		}

	}
}
