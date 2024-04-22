package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class feespayment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		
		Actions a= new Actions(driver);
		WebElement un= driver.findElement(By.xpath("//a[@class='pam cls']"));
		a.moveToElement(un).perform();
		
		Thread.sleep(1000);
		
		WebElement un2= driver.findElement(By.xpath("//a[@class='pam cls']"));
		un2.click();
		
		
	}

}
