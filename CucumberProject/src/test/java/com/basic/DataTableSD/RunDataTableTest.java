package com.basic.DataTableSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"pretty",
				"html:target/cucumber-report.html",
		        "json:target/cucumber-report.json2",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		features={"src/test/resources/com/basic/DataTableFF"}
	//	dryRun=	true
		
		)
		
		
		public class RunDataTableTest {

	

}
