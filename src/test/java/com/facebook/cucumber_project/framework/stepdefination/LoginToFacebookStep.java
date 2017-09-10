/**
 * 
 */
package com.facebook.cucumber_project.framework.stepdefination;

import org.openqa.selenium.By;

import com.facebook.cucumber_project.framework.helper.TestBase.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;;

/**
 * @author choudhuryIqbal
 *
 */
public class LoginToFacebookStep {
	@Given("^User navigated to FACEBOOK\\.COM$")
	public void user_navigated_to_FACEBOOK_COM() throws Throwable {
	    Base.driver.get("https://www.facebook.com/");
	}

	@When("^user enter Username as \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enter_Username_as_and_Password(String arg1, String arg2) throws Throwable {
	   Base.driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(arg1);
	   Base.driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(arg2);
	   
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   Base.driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	   
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		Base.driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

	@Then("^login should not be successful$")
	public void login_should_not_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
