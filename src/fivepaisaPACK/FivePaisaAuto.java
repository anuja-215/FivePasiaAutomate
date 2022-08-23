package fivepaisaPACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FivePaisaAuto {
	
	       public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO-PC\\Desktop\\New folder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://login.5paisa.com/");
			
			Thread.sleep(3000);
			WebElement USER=driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
			USER.sendKeys("9404698376");
			Thread.sleep(3000);
			WebElement PASS=driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]"));
			PASS.sendKeys("Admin@123");
			Thread.sleep(3000);
			WebElement DOB=driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]"));
			DOB.sendKeys("22081995");
			WebElement LOGIN=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
			LOGIN.click();
		
			Thread.sleep(3000);
			
			driver.quit();
			
			

		}

	}


