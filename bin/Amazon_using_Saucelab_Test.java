import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_using_Saucelab_Test {
	public static final String USERNAME = "Lokesh1";

	  public static final String ACCESS_KEY = "16c07448-dc1c-4445-904d-6ced87d6e1fa";

	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	// TODO Auto-generated method stub

	DesiredCapabilities caps = DesiredCapabilities.chrome();

	caps.setCapability("platform", "Windows 10");

	caps.setCapability("version", "51.0");

	WebDriver driver=new RemoteWebDriver(new URL(URL), caps);
	driver.get("http://amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    WebElement Signin = driver.findElement(By.xpath("//span[contains(.,'Hello, Sign in')]"));
    Signin.click();
    WebElement userName = driver.findElement(By.id("ap_email"));
    userName.sendKeys("8123049704");
    WebElement Continue = driver.findElement(By.id("continue"));
    Continue.click();
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Loki@1234");
    WebElement Submit = driver.findElement(By.id("signInSubmit"));
    Submit.click();
    driver.findElement(By.className("nav-search-scope")).click();
    WebElement staticdDropdown=driver.findElement(By.id("searchDropdownBox"));
    Select dropdown =new Select(staticdDropdown);
    //dropdown.selectByIndex(5);
    dropdown.selectByVisibleText("Books");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("core java");
    driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
    driver.findElement(By.xpath("//*[contains(text(),'Core Java Volume I--Fundamentals (Core Series)')]")).click();
    driver.findElement(By.id("rentButton")).click();
	driver.findElement(By.id("nav-cart-count")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div[1]/h1")).getText());
	driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
	}

}
