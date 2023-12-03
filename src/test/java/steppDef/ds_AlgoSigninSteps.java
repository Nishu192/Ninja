package steppDef;

import org.testng.Assert;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DSIntro_PF;

import pages.Signin_PF;
import utilities.BaseClass;
import utilities.LoggerLoad;

public class ds_AlgoSigninSteps extends BaseClass{
	Signin_PF sp;
	DSIntro_PF ip;
		
	@Given("The user is on the DS Algo Introduction Page")
	public void the_user_is_on_the_ds_algo_introduction_page() {
	
		sp=new Signin_PF(BaseClass.getDriver());
		ip=new DSIntro_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on the DS Algo Introduction Page");
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	    ip.clickSignin();
		LoggerLoad.info("User clicks the Sign in link");
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	   String url= BaseClass.getCurrentUrl();
	   System.out.println("Current user login url :  "+url);
	   LoggerLoad.info("User is on sign in page");
	}

	@Then("The user is able to see {string} link  below the text boxes")
	public void the_user_is_able_to_see_link_below_the_text_boxes(String expLnk) {
		String actLnk=sp.getSignpageMsg();
	  // String actMsg=sp.getBtmTextmsg();
	   Assert.assertEquals(actLnk, expLnk);
	   LoggerLoad.info("User see Register link");
	}


	@When("The user clicks login button after entering valid {string} and invalid {string}")
	public void the_user_clicks_login_button_after_entering_valid_and_invalid(String username, String password) {
	 

	    sp.validUsernameAndInvalidPassword(username, password);
	    sp.ClickLogin();
	    LoggerLoad.info("User clicks login button after entering valid username and invalid pwd");
	}

	@When("The user clicks login button after leaving the {string} textbox and {string} textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_blank(String string, String string2) {
	    
	    sp.blankUsernameAndBlankPassword();

	    sp.ClickLogin();
	    LoggerLoad.info("User clicks login button without entering any data");
	}

	@When("The user clicks login button after entering the {string} and leaves {string} textbox blank")
	public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_blank(String username, String password) {
	   sp.validUsernameAndBlankPassword(username,password);
	   sp.ClickLogin();
	   LoggerLoad.info("User clicks login button after entering username only");
	}
	@Then("The error message {string} appears below Pwd textbox")
	public void the_error_message_appears_below_pwd_textbox(String expTmsg) {
	    
	   String actTmsg= sp.getTiptoolpwrdWarnMsg();
	   Assert.assertEquals(actTmsg, expTmsg);
	   LoggerLoad.warn("The error message appears below Pwd textbox");
	}

	@When("The user clicks login button after entering the {string} and leaves {string} blank")
	public void the_user_clicks_login_button_after_entering_the_and_leaves_blank(String username, String password) {
	    sp.enterUsernameOnly(username, password);
	    sp.ClickLogin();
	    LoggerLoad.info("User clicks login button after entering username only");
	}

	@When("The user clicks login button after entering invalid {string} and invalid {string}")
	public void the_user_clicks_login_button_after_entering_invalid_and_invalid(String username, String password) {
	    sp.invalidUsernamePwd(username, password);
	    sp.ClickLogin();
	    LoggerLoad.info("User clicks login button after entering invalid  and invalid data");
	}

	@Then("The user should able to see an error message {string}.")
	public void the_user_should_able_to_see_an_error_message(String expwg) {
	   String actwg= sp.getWarnMsg();
	   Assert.assertEquals(actwg, expwg);
	   LoggerLoad.warn("The user sees an error message ");
	}
	@When("The user clicks login button after entering the {string} only.")
	public void the_user_clicks_login_button_after_entering_the_only(String pwd) {
	    sp.enterPwdonly(pwd);
	    LoggerLoad.info("User clicks login btn after entering pwd");
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String expTMsg) {
		
	    String actTmsg =sp.getTiptoolSinWarnMsg();
	    Assert.assertEquals(actTmsg, expTMsg);
	    LoggerLoad.warn("The user sees an error message below Username textbox");
	}

	
@When("The user clicks login button after entering valid {string} and valid {string}")
public void the_user_clicks_login_button_after_entering_valid_and_valid(String username, String password) {
   

	    sp.validUsernameAndBlankPassword(username, password);
	    sp.ClickLogin();
	    LoggerLoad.info("User clicks login button after entering invalid  and valid data");
	}

	
	@Then("The user should land in Data Structure Home Page with {string} message")
	public void the_user_should_land_in_data_structure_home_page_with_message(String expMsg) {
		String url=BaseClass.getCurrentUrl();
		System.out.println("The user is on the current url : "+url);
		String actMsg=sp.getLoggedInmsg();
		Assert.assertEquals(actMsg, expMsg);
		LoggerLoad.info("The user is on Data Structure Home Page");
	}



}
