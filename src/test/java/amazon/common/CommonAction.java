package amazon.common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction implements CommonFunction {
	public static Actions a;
	public static JavascriptExecutor js;
	public static WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-popups");
	    options.addArguments("--disable-notifications");
	    options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
	}
	public void closeBrowser() {
		driver.quit();
	}
	//window 
	//sendkeys, click
	//actions
	//select
	//Waits
	//gettext
	//js
	//ss
	//alert
	//frames
	public void inputText(WebElement e, String value) {
		e.sendKeys(value,Keys.ENTER);
	}
	public void inputText(WebElement e,int v, String value) {
		e.sendKeys(value);
	}
	public void button(WebElement e) {
		e.click();
	}
	public void inputText(String value, WebElement e) {
		a = new Actions(driver);
		a.sendKeys(e, value).build().perform();
	}
	public void button(WebElement e, int i ) {
		a = new Actions(driver);
		a.click(e).build().perform();
	}
	public void handleWindows() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if(!x.equals(parent)) {
				driver.switchTo().window(x);
			}
			
		}
	}
	public void inputText(WebElement e, String string, int j) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+string+"')", e);
	}
	public void button(int i, WebElement e ) {
		js.executeScript("arguments[0].click", e);
	}
	
	
	
}
