package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		
		Actions a= new Actions(driver);
		WebElement un= driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		a.moveToElement(un).perform();
		
		WebElement un2= driver.findElement(By.xpath("//a[normalize-space()='Programming Language']"));
		a.moveToElement(un2).perform();
		
		Thread.sleep(2000);
		
		WebElement un3= driver.findElement(By.xpath("//a[normalize-space()='.NET 4 Months']"));
		un3.click();

	}

}
