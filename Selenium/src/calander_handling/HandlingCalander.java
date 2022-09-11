package calander_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalander {
	
	public static void main(String args[]) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

	

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector(".desktop.in.webp")).click();
		System.out.println("********************************************");
		
		//close login popup
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		System.out.println("********************************************");
		
		//identify departure date and click on it
		driver.findElement(By.cssSelector(".desktop.in.webp")).click();
		System.out.println("********************************************");
		
		driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative")).click();
		System.out.println("********************************************");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		System.out.println("********************************************");
		
		//select any date from next month
		driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();

}}