package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		
		Actions a= new Actions(driver);
		WebElement un= driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		a.moveToElement(un).perform();
		
		WebElement un2= driver.findElement(By.xpath("//a[normalize-space()='Java Technology+']"));
		a.moveToElement(un2).perform();
		
		Thread.sleep(3000);
		 
		WebElement un3= driver.findElement(By.xpath("//a[contains(text(),'Java For')]"));
		un3.click();
	}

}
