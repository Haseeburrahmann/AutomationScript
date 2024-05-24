package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com/");
	
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	
	//hi
	driver.manage().timeouts().getImplicitWaitTimeout();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mumbai");
	//driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).sendKeys("Hyderabad");
	
	
	
	
	Alert alert = driver.switchTo().alert();
	
	//alert.accept();
	//Haseeb is my Name
     driver.quit();
	
  }
}
