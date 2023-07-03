package amazon.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import amazon.common.CommonAction;

public class TodayDealsLocators extends CommonAction {

	//stale element reference 
	public TodayDealsLocators() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement accounts;

	public WebElement getAccounts() {
		return accounts;
	}
	
	@FindBy(xpath="//label[contains(text(),'Password')]")
	private WebElement password;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']")
	private List<WebElement> products;
	
	@FindBy(xpath = "//div[@class='BadgeAutomatedLabel-module__badgeAutomatedLabel_2Teem9LTaUlj6gBh5R45wd']")
	private List<WebElement> percentages;

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public List<WebElement> getProducts() {
		return products;
	}

	public List<WebElement> getPercentages() {
		return percentages;
	}
	
}
