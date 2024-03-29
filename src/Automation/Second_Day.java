package Automation;  

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Day {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement nav_simple, button1, nav_confirm, button2, nav_submission, button3;
		Alert alt;
		
		nav_simple = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		nav_simple.click();
		
		button1 = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		button1.click();
			
		Thread.sleep(5000);
		
		alt = driver.switchTo().alert();
		alt.accept();
		
		nav_confirm = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		nav_confirm.click();
		
		button2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		button2.click();
		
		Thread.sleep(5000);
		alt.dismiss();
		
		nav_submission = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		nav_submission.click();
		button3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button3.click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().sen dKeys("Class 8 am");
		driver.switchTo().alert().accept();
		
		
		

	}

}
