package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class ExplicitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		
		WebElement nav_login, txtbox_username, txtbox_password, loginButton;
		
		//finding location of log in in demoblaze
		nav_login = driver.findElement(By.id("login2"));
		//giving mouse action click in in Log IN
		nav_login.click();
		
		//holds the code for 5 seconds
//		Thread.sleep(5000);
		WebDriverWait ww = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
//		finding text box username using id locator
		txtbox_username = ww.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
		
		//entering username using keyboard action send keys
		txtbox_username.sendKeys("testmorning");
		
		//finding location of text box password using id locator
		txtbox_password = driver.findElement(By.id("loginpassword"));
		
		//entering password using keyboard action send keys
		txtbox_password.sendKeys("test123");
		
		//finding location of login button using xpath locator
		loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		
		//giving the mouse action of click on login button
		loginButton.click();

	}

}
      