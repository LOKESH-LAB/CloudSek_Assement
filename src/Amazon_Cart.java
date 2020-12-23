import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;



public class Amazon_Cart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E://Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement Signin = driver.findElement(By.xpath("//span[contains(.,'Hello, Sign in')]"));
	    Signin.click();
        WebElement userName = driver.findElement(By.id("ap_email"));
        userName.sendKeys("8123049704");
        WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Loki@123");
        WebElement Submit = driver.findElement(By.id("signInSubmit"));
        Submit.click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("core java");
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Core Java Volume I--Fundamentals (Core Series)')]")).click();
        driver.findElement(By.id("rentButton")).click();
    	
 
	}
}

