package handling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {
	
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		
		WebElement carDropdownOption = driver.findElement(By.id("multiselect1"));
		
		Select carDropdown = new Select(carDropdownOption);
		
		System.out.println("Is car dropdown allows multiple selection : "+carDropdown.isMultiple());
		
		//System.out.println("Option selected : "+carDropdown.getFirstSelectedOption().getText()); -->> gives error as no options selected
		
		List<WebElement> allOptions = carDropdown.getOptions();
		
		System.out.println("Count of dropdown : "+allOptions.size());
		
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println("Car Dropdown List:"+i+" : "+allOptions.get(i).getText());
			
		}
		
		carDropdown.selectByIndex(1);
		System.out.println("Option selected : "+carDropdown.getFirstSelectedOption().getText()); //gives result Swift as always shows the first selected option
		
		carDropdown.selectByVisibleText("Audi");
		System.out.println("Option selected : "+carDropdown.getFirstSelectedOption().getText()); //gives result Swift as always shows the first selected option
		
		carDropdown.selectByValue("Hyundaix");
		System.out.println("Option selected : "+carDropdown.getFirstSelectedOption().getText()); //gives result Swift as always shows the first selected option
		
		carDropdown.selectByVisibleText("Swift"); //already selected on line no. 43; no changes keeps selected
		carDropdown.selectByValue("Hyundaix");  //already selected on line no. 46; no changes keeps selected
		
		// ****get all the selected options
				List<WebElement> selectedCars=carDropdown.getAllSelectedOptions();
				System.out.println("Selected car count: "+selectedCars.size());
				
				for(int i=0; i<selectedCars.size(); i++) {
					System.out.println("Selected Car List: "+selectedCars.get(i).getText());
				}
		
		// ****deselect already select options		
		
				carDropdown.deselectByIndex(1);
				System.out.println("Option selected : "+carDropdown.getFirstSelectedOption().getText()); //gives result Hyundai now as Swift gets deselected and it always shows the first selected option
		
				carDropdown.deselectByValue("Hyundaix");
				carDropdown.deselectByVisibleText("Audi");
		
				carDropdown.deselectByVisibleText("Swift"); //already deselected on line no. 65; no changes keeps deselected
				carDropdown.deselectByValue("Hyundaix");  //already deselected on line no. 68; no changes keeps deselected
		
				carDropdown.selectByIndex(1);
				carDropdown.selectByIndex(2);
				carDropdown.selectByIndex(3);
				
				carDropdown.deselectAll();
				
		System.out.println("***********************END*********************");				
	}	

}
