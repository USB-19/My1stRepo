package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaPhoneFinder {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().window().maximize();

		driver.get("https://www.gsmarena.com/");

		System.out.println("****************************************************");

		// Thread.sleep(4000);

		List<WebElement> phoneFinder = driver.findElements(By.cssSelector(
				"html>body>div#wrapper>div#outer.row>div#body>aside.sidebar.col.left>div.brandmenu-v2.light.l-box.clearfix>ul>li"));

		System.out.println("Phone Finder Phone Count : " + phoneFinder.size());

		System.out.println("****************************************************");

		for (int i = 0; i < phoneFinder.size(); i++) {

			System.out.println("Phone Finder Phone Name List : " + phoneFinder.get(i).getText());
		}

		System.out.println("****************************************************");

		// driver.findElement(By.cssSelector("html>body>div#wrapper>div#outer.row>div#body>aside.sidebar.col.left>div.brandmenu-v2.light.l-box.clearfix>ul>li>a[linkText='samsung']")).click();

		driver.findElement(By.cssSelector(".brandmenu-v2 li>a")).click(); // If not given specific locator then it will select first locator out of all the locators (Selected samsung as it is 1st of all)
		
		//driver.findElement(By.cssSelector(".brandmenu-v2 li>a[href='samsung-phones-9.php']")).click(); -->>Specific Samsung
		
		System.out.println("****************************************************");

		List<WebElement> samsungPhone = driver.findElements(By.cssSelector(" #review-body>.makers li>a span"));

		System.out.println("Samsung Phone Count On 1st Page : " + samsungPhone.size());

		for (int i = 0; i < samsungPhone.size(); i++) {

			System.out.println(samsungPhone.get(i).getText());
		}
		System.out.println("*******************************************************");
		
		Thread.sleep(4000);

		System.out.println("**************************Pagination**************************");

		List<WebElement> pagination = driver.findElements(By.cssSelector(".nav-pages"));

		if (pagination.size() > 0) {
			System.out.println("Pagination Exists..");
		} else {
			System.out.println("Pagination Does Not Exists..");
		}

		
		for(int i=0; i<pagination.size(); i++) {
			System.out.println("Pagination Name : " + pagination.get(i).getText());	
		}
		
		System.out.println("*******************************************************");
		
		driver.findElement(By.cssSelector("a[href='cat-phones-89.php']")).click(); //>>No Pagination
		//or
		//driver.get("https://www.gsmarena.com/cat-phones-89.php");
		
		List<WebElement> pagination1 = driver.findElements(By.cssSelector(".nav-pages")); //as no pagination means no .nav-pages locator, but List<> can be empty & hence it will not give any error even-though it can't find .nav-pages locator.

		if (pagination1.size() > 0) {
			System.out.println("Pagination Exists..");
		} else {
			System.out.println("Pagination Does Not Exists..");
		}

		
		for(int i=0; i<pagination1.size(); i++) {
			System.out.println("Pagination Name : " + pagination1.get(i).getText());	
		}
		
		System.out.println("*******************************************************");
		
		driver.findElement(By.cssSelector(".brandmenu-v2 li>a[href='samsung-phones-9.php']")).click();
		
		System.out.println("**************************End**************************");

	}
}