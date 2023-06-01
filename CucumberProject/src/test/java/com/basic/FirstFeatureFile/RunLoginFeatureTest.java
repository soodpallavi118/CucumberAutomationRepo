package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"pretty",
				"html:target/cucumber-report.html",
		        "json:target/cucumber-report.json3",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		features={"src/test/resources/com/basic/FirstFeatureFileFF"}
	//	dryRun=	true
		
		)
		
		
		public class RunLoginFeatureTest {

	

}
