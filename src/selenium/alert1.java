package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//  alert.popup
		driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window();
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']]"));
        
        Alert alert=driver.switchTo().alert();
        Thread.sleep(5000);
        System.out.println(alert.getText());
	    alert.accept();
	
	    //confirmation box
	    driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();     
	    driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
		
		


		
		

	}

}
