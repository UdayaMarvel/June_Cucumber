package com.amazon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\June_Cucumber\\src\\test\\resources\\TodaysDeals.feature",
					glue = "com.amazon",
					tags= {"@smoke","@sanity","@regress"},
					dryRun= false,
					plugin = {"html:target","json:target/report.json"},
					monochrome=true)
public class TestRunner {

}
