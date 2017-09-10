package com.facebook.cucumber_project.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/FacebookLogin.feature" },
glue= {"classpath:com.facebook.cucumber_project.framework.stepdefination",
		"classpath:com.facebook.cucumber_project.framework.helper"},
plugin= {"pretty","json:target/FacebookLoginFeatureRunner.json"}
		)
public class FacebookLoginFeatureRunner extends AbstractTestNGCucumberTests {

}