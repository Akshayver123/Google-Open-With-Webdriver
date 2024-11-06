import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {

WebDriver driver;
	
	public void openBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.get("https://www.facebook.com/");
		
		System.out.println("Page title is: "+ driver.getTitle());
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("pg183558@gmail.com");
		password.sendKeys("12345");
		password.submit();
		email.clear();
		password.clear();
		
		//driver.close();
		//driver.quit();
		
		//Thread.sleep(200);
		WebElement L = driver.findElement(By.id("login"));//fetch the login 
		L.click();
		
		String pageSource = driver.getPageSource(); 
		System.out.println("Page Source: \n"+pageSource);
		
	}
	public static void main(String[] args) {
		
		First f= new First ();
		f.openBrowser();

	}

}
