package com.basic.TagsSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"pretty",
		        "json:target/cucumber-report.json4",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		       },
				
		tags=("@Smoke"), //Only smoke scenarios get executed
	//	tags= ("@Important"), // All scenarios get executed
	//  tags=("@Smoke and @Regression"), acts as and operator 
	//	tags=("@Smoke or @Regression"),  acts as or operator
		features={"src/test/resources/com/basic/TagsFF"}
		
		
		
		
	//	dryRun=	true
		
		)
		
		
		public class RunTagsFeatureTest {

	

}
