import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
WebDriver driver;
	
	public void openBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		Select drpCountry = new Select(driver.findElement(By.name("state")));
		Select drpCity = new Select(driver.findElement(By.name("city")));
		Select Gender = new Select(driver.findElement(By.cssSelector("#gender")));
		
		drpCountry.selectByVisibleText("Uttar Pradesh");
		drpCountry.selectByValue("Uttar Pradesh");
		drpCity.selectByVisibleText("Agra");
		drpCity.selectByValue("Agra");
		
		 // Gender.click();
	       // System.out.println("Selected male");

	      //  Thread.sleep(1000);


           
		Gender.selectByVisibleText("Male");
		Gender.selectByValue("Male");
		 
	       


		
		//drpCountry.deselectByValue("Uttar Pradesh");
		drpCountry.selectByIndex(2);
		

		if (drpCountry.isMultiple())
		{
			
		  System.out.println("True");
		}else {
			System.out.println("False");
		}
		drpCountry.deselectAll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown d = new DropDown ();
		d.openBrowser();
	}

}
