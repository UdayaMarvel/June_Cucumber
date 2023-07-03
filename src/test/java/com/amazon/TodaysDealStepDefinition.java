package com.amazon;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import amazon.common.CommonAction;
import amazon.objectrepository.TodayDealsLocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TodaysDealStepDefinition extends CommonAction {
	CommonAction co = new CommonAction();
	TodayDealsLocators td = new TodayDealsLocators();
	public static String prod;
	public static  List<WebElement> products;
	static String fire;
	@Given("launch the browser with url {string}")
	public void launch_the_browser_with_url(String url) {
		driver.get(url);
	}
	@When("user signing in {string}")
	public void user_signing_in(String name) {		
		co.button(td.getAccounts());
	    co.inputText(td.getEmail(), name);
		 if(td.getPassword().isDisplayed()==true) {
			 driver.navigate().back();
			 driver.navigate().back();
		 }
		 else {
			 System.out.println("Element is not displayed");
		 }
	}
	@When("user signing in with one dim map")
	public void user_signing_in_with_one_dim_map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		String user = asMap.get("user2");
	    co.button(td.getAccounts());
	    co.inputText(td.getEmail(), user);
		 if(td.getPassword().isDisplayed()==true) {
			 driver.navigate().back();
			 driver.navigate().back();
		 }
		 else {
			 System.out.println("Element is not displayed");
		 }
	}

	@And("user enter the mail id")
	public void user_enter_the_mail_id() {
		System.out.println("entered");
	}

	@And("user clicks on todays deals")
	public void user_clicks_on_todays_deals() {
	 co.button(td.getSubmit());
	 WebElement today = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
	 co.button(today, 0);
	}

	@Then("validate the products displayed with percentage")
	public void validate_the_products_displayed_with_percentage() {

	for(int i = 0; i<td.getProducts().size();i++) {
		WebElement product = td.getProducts().get(i);
		prod = product.getText();
		int j = i;
		WebElement percentage = td.getPercentages().get(j);
		String percent = percentage.getText();
		if(percent.contains("Up")) {
			j++;
			System.out.println(prod+" - "+percent);
		}

	}
	}
	@When("user clicks on product")
	public void user_clicks_on_product() {
	    WebElement product1 = td.getProducts().get(0);
	    fire = product1.getText();
	    product1.click();
	     
	}

	@Then("validate the related product displayed")
	public void validate_the_related_product_displayed() {
	List<WebElement> amazonfire = driver.findElements(By.xpath("//div[contains(@class,'truncate-fallback')]"));
	co.handleWindows();
	for(int k = 0; k<amazonfire.size();k++) {
		WebElement firestick = amazonfire.get(k);
		String stick = firestick.getText();
		if(stick.contains(fire)) {
			System.out.println("related product"+fire);
		}
		else {
			System.out.println("not related :"+stick);
		}
	}
	}

@Then("validate")
public void validate() {
    
}
}
