package selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_driver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Str");
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("wyz");
		
		WebElement phone=driver.findElement(By.xpath("//*[@name='phone']"));
		phone.sendKeys("1231424243");
		
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("abc@xyz");
		
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("ARMENIA");
		
		WebElement submit= driver.findElement(By.name("submit"));
		submit.click();
		
		driver.quit();
		
		
		
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver1= new FirefoxDriver();
		driver1.navigate().to("https://www.google.com/");*/
	}

}
