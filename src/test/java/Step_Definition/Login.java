package Step_Definition;

import Pages.Orange_HRM_Cookies;
import Tests.Test_base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login extends Test_base {
    Orange_HRM_Cookies CR;


    @Given("The user in the login page")
    public void the_user_in_the_login_page() {
    CR = new Orange_HRM_Cookies(driver);
    }
    @When("I entered the {string}, {string}")
    public void i_entered_the(String username, String password) throws InterruptedException {
    CR.loginC(username,password);
    }
    @When("I pressed log in button")
    public void i_pressed_log_in_button() throws InterruptedException {
    CR.loginTBN();
    }
    @When("I entered the login Data")
    public void i_entered_the_login_Data() throws InterruptedException {
        CR.loginC("Admin","admin123");
    }
    @Then("The login page is displayed")
    public void the_login_page_is_displayed() {
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",driver.getCurrentUrl());
    }
    @Then("The Home page is displayed")
    public void the_Home_page_is_displayed() {
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList",driver.getCurrentUrl());
    }
}
