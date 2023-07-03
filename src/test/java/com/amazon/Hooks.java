package com.amazon;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import amazon.common.CommonAction;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	CommonAction co = new CommonAction();
@Before
public void launch(Scenario scenario) {
	co.launchBrowser();
	final byte[] beforess=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(beforess, "image/png");
}
@After
public void end(Scenario scenario) {
	final byte[] afterss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(afterss, "image/png");
	co.closeBrowser();
}
}
