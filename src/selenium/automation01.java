package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class automation01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	//	driver.getTitle();
		WebElement un= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		
		WebElement pw= driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pw.sendKeys("admin123");
		
		WebElement lg= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        lg.click();
        
        Thread.sleep(2000);
        
		WebElement buzz= driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		buzz.click();
		
		Thread.sleep(4000);
		
		WebElement post= driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
		post.sendKeys("hello world");
		
		WebElement postclick= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		postclick.click();	
		
		
		
		
  

	}

}
