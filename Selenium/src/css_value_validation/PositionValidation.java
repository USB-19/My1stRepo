package css_value_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PositionValidation {
	
	
	public static void main(String args[]) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

	

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
	
		driver.findElement(By.id("loginButton")).click();
		
		WebElement errorMsg = driver.findElement(By.cssSelector(".errormsg"));
	
		System.out.println("Error Msg. Text : "+errorMsg.getText());
		
		System.out.println("Error Msg. Text Colour : "+errorMsg.getCssValue("color"));
		
		
		Point errorMsgLocation = errorMsg.getLocation();
			
		int errorMsgX = errorMsgLocation.getX();
		int errorMsgY = errorMsgLocation.getY();
		
		System.out.println("Error Msg. X Cordinates : "+errorMsgX);
		System.out.println("Error Msg. Y Cordinates : "+errorMsgY);
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		
		Point locationUsername=usernameInputField.getLocation();
		
		int usernameX=locationUsername.getX();
		int usernameY=locationUsername.getY();
				
		System.out.println("Username X cord: "+usernameX);
		System.out.println("Username Y cord: "+usernameY);
		
	
		int pwdY=driver.findElement(By.name("pwd")).getLocation().getY();
		
		System.out.println("Pwd y: "+pwdY);

		System.out.println("is Error msg getting displayed above the username field? "+(errorMsgY<usernameY));

		

}
}