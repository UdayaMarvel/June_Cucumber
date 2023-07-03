package amazon.common;

import org.openqa.selenium.WebElement;

public interface CommonFunction {

	public void launchBrowser();
	public void closeBrowser();
	public void inputText(WebElement e, String value); 
	public void inputText(WebElement e,int v, String value); 
	public void button(WebElement e); 
	public void inputText(String value, WebElement e); 
	public void button(WebElement e, int i ) ;
	public void handleWindows();
	public void inputText(WebElement e, String string, int j); 
	public void button(int i, WebElement e );
}
