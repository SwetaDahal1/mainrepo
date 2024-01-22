package Automation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class First_Day {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();     
		
		WebElement nav_login,login_text,password_text,loginButton; 
		nav_login = driver.findElement(By.id("login2"));
		nav_login.click();
		Thread.sleep(5);
		login_text = driver.findElement(By.id("loginusername"));
		login_text.sendKeys("testmorning");
		password_text = driver.findElement(By.id("loginpassword"));
		password_text.sendKeys("text123");
		loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginButton.click();
		
		
		
		
		

	}

}     
