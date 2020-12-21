
import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;



public class SauceLabsTest {

public static final String USERNAME = "Lokesh1";

  public static final String ACCESS_KEY = "16c07448-dc1c-4445-904d-6ced87d6e1fa";

  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



public static void main(String[] args) throws MalformedURLException, InterruptedException {

// TODO Auto-generated method stub

DesiredCapabilities caps = DesiredCapabilities.chrome();

caps.setCapability("platform", "Windows 10");

caps.setCapability("version", "51.0");

WebDriver driver=new RemoteWebDriver(new URL(URL), caps);

//Test Case 2: Register Page 
driver.get("https://gitlab.com/users/sign_in");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[contains(.,'Register now')]")).click();
driver.manage().window().maximize();
driver.findElement(By.xpath("(//input[contains(@id,'name')])[2]")).sendKeys("Lokesh");
driver.findElement(By.xpath("(//input[contains(@id,'name')])[3]")).sendKeys("Jamadar");
driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Lokesh");
driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("lokeshloki513@gmail.com");
driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Loki@12345");
driver.findElement(By.xpath("//input[@type='submit']")).click();
System.out.println(" There was an error with the reCAPTCHA. Please solve the reCAPTCHA again.");


//Test Case 1: Login Page
driver.get("https://gitlab.com/users/sign_in");
driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("lokeshloki513@gmail.com");
driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Loki@123");
driver.findElement(By.xpath("//input[@type='submit']")).click();


//Test Case 3: New Project Page 
driver.get("https://gitlab.com/projects/new#blank_project");
/*driver.findElement(By.xpath("(//input[@id='project_name'])[1]")).sendKeys("Peerxp");
driver.findElement(By.xpath("(//input[contains(@id,'20')])[1]")).click();
driver.findElement(By.xpath("(//input[@value='Create project'])[1]")).click();*/
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

}



}



