package steppDef;

import java.io.IOException;




import java.util.List;
import java.util.Map;


import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Arrays_PF;
import pages.DSIntro_PF;
import pages.DS_AlgoPortal_PF;

import pages.HomePage_PF;
import pages.Registration_PF;
import utilities.BaseClass;
import utilities.LoggerLoad;

public class ds_AlgoPortalSteps extends BaseClass {
	
DS_AlgoPortal_PF pp;
DSIntro_PF  ip;
HomePage_PF hp;
Registration_PF rp;
Arrays_PF ap;


@Given("The user should be open the browser")
public void the_user_should_be_open_the_browser() throws IOException {

	BaseClass.setUp();
pp=new DS_AlgoPortal_PF (BaseClass.getDriver());
LoggerLoad.info("User open the browser");
   
}
@When("The user enter the DS_Algo Portal https:\\/\\/dsportalapp.herokuapp.com\\/")
public void the_user_enter_the_ds_algo_portal_https_dsportalapp_herokuapp_com() {

	String url=BaseClass.getDSurl();
	BaseClass.openPage(url);
	LoggerLoad.info("User enter the url");
}


@Then("The user should landed on the DS_Algo Get Started page with message {string}")
public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message(String expectedMsg) {
    String actualMsg=pp.portalMsg();
        
   Assert.assertEquals(actualMsg, expectedMsg);
	LoggerLoad.info("User is on the first page ");
}

@Given("The user should open the DS Algo Portal URL in any supported browser")
public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
	String tl=BaseClass.getTitle();
	System.out.println(tl);
 
  pp=new DS_AlgoPortal_PF (BaseClass.getDriver());
  ip=new DSIntro_PF(BaseClass.getDriver());
  
  
}

@When("The user clicks the Get Started button")
public void the_user_clicks_the_get_started_button() {
    

		pp.clickGetStarted();
		
		LoggerLoad.info("User clicks getstarted button of First page");
}

@Then("The user should land in Data Structure Introduction Page with {string} and {string} links")
public void the_user_should_land_in_data_structure_introduction_page_with_and_links(String expReg, String expSn) {
    

	 String actReg= ip.gettxtReg();
	 String actSn= ip.getTxtSn();
	 Assert.assertEquals(actReg, expReg);
	  Assert.assertEquals(actSn, expSn);
	  LoggerLoad.info("User is on the intro page of DS"); 
}

@Given("The user is on the DS Introduction page")
public void the_user_is_on_the_ds_introduction_page() {
	 ip=new DSIntro_PF(BaseClass.getDriver());
	 hp=new HomePage_PF(BaseClass.getDriver());
	 rp=new Registration_PF(BaseClass.getDriver());
}

@When("The user clicks the data structure dropdown  arrow")
public void the_user_clicks_the_data_structure_dropdown_arrow() {
   ip.clickDSDropdown();
   LoggerLoad.info("User clicks the dropdown of Data Structure");
}

@Then("The user should able to see {int} options Arrays {string} in dropdown menu")
public void the_user_should_able_to_see_options_arrays_in_dropdown_menu(Integer expNumb, String expOptn) {
    
   String actOptn=ip.getMenuOptions(expOptn);
   
    Assert.assertEquals(actOptn,expOptn );
    LoggerLoad.info("User can see 6 options in dropdown");
}


@When("The user selects any data structures item from the drop down without Sign in.")
public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
    ip.clickLinkedListDropdown();
    LoggerLoad.info("User click any option of dropdown without sign in");
}

@Then("The user should able to see an warning message {string}")
public void the_user_should_able_to_see_an_warning_message(String expMsg) {
   String actMsg= ip.getTxtAlertMsg();
   Assert.assertEquals(actMsg,expMsg);
    LoggerLoad.warn("User sees an warning message for signing in");
}
    
    @When("The user clicks any {string} buttons of data structures  on the DS Introduction page")
    public void the_user_clicks_any_buttons_of_data_structures_on_the_ds_introduction_page(String string) {
        
    	hp.clickArrayGetStarted();
    	LoggerLoad.info("User clicks getstarted button of any 6 DS");
    }

    @When("The user clicks {string} link on the DS Introduction page")
    public void the_user_clicks_link_on_the_ds_introduction_page(String Register) {
       ip.clickRegister();
       LoggerLoad.info("User clicks register link");
    }

    @Then("The user should be redirected to Register form")
    public void the_user_should_be_redirected_to_register_form() {
        String tt=BaseClass.getTitle();
        System.out.println("Title of the Registration Page:"+tt);
        LoggerLoad.info("User is on the registration page ");
    }

    
    @Then("The user should able see a {string} link at the botom of the page")
    public void the_user_should_able_see_a_link_at_the_botom_of_the_page(String expLnk) {
      String actLnk=rp.getloginMsg();
      Assert.assertEquals(actLnk,expLnk);
        LoggerLoad.info("User sees Login link on the page ");
    }

    
    @Given("The user is on the new user registration page")
    public void the_user_is_on_the_new_user_registration_page() throws IOException {
    	rp=new Registration_PF(BaseClass.getDriver());
        hp=new HomePage_PF(BaseClass.getDriver());
      String url= BaseClass.getCurrentUrl();
     
      System.out.println(url);
    }

    @When("The user clicks Register button with all fields empty")
    public void the_user_clicks_register_button_with_all_fields_empty(io.cucumber.datatable.DataTable dataTable) {
    	
    	 rp.allBlank();
    	 rp.clickRegister();
    	 LoggerLoad.info("User  clicks Register button with all fields empty ");
    	    
    }

    @Then("The error {string} appears below Username textbox")
    public void the_error_appears_below_username_textbox(String expMsg) {
    	String actMsg= rp.getTiptoolSinMsg();
    	 Assert.assertEquals(actMsg,expMsg);
    	 LoggerLoad.info("The tooltip message appears below Username textbox ");
    }    
    	
    	@When("The user clicks Register button after entering Username with other fields empty")
    	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty(io.cucumber.datatable.DataTable dataTable) {
    		List<Map<String,String>> regList=dataTable.asMaps(String.class,String.class);
    		for(Map<String,String>e: regList) {
    	    	String username=e.get("Username");
    	    rp.enterOnlyUsername(username);
    	    	rp.clickRegister();
    	    	 LoggerLoad.info("User  clicks Register button after entering Username with other fields empty ");
    	    }
    }

    @Then("The error message {string} appears below Password textbox")
    public void the_error_message_appears_below_password_textbox(String expMsg) {
       String actMsg= rp.getTiptoolPwdMsg();
        Assert.assertEquals(actMsg,expMsg);
        LoggerLoad.info("The tooltip message appears below Username textbox ");
    }
    @When("The user clicks Register button after entering Username and password with Password Confirmation field empty")
    public void the_user_clicks_button_after_entering_username_and_password_with_password_confirmation_field_empty(DataTable dataTable) {
    	List<Map<String,String>> regList=dataTable.asMaps(String.class,String.class);
    	   System.out.println(regList);
    	    for(Map<String,String>e: regList) {
    	    	String username=e.get("Username");
    	    	String pwd=e.get("Password");
    	    	
    	    	rp.enterUsernamePassword(username, pwd);
    	    	rp.clickRegister();
    	    	LoggerLoad.info("User  clicks Register button after entering Username  and password with Password Confirmation field empty");
    	    }
    	    }
   

    @Then("The error message {string} appears below  Password Confirmation textbox")
    public void the_error_message_appears_below_password_confirmation_textbox(String expMsg) {
    	String actMsg= rp.getTiptoolConfPwdMsg();
        Assert.assertEquals(actMsg,expMsg);
    	  LoggerLoad.info("The tooltip message appears below Username textbox ");
    }

    @When("The user clicks Register button after entering a username with spacebar characters other than digits and special char")
    public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and(DataTable dataTable) {
    	List<Map<String,String>> regList=dataTable.asMaps(String.class,String.class);
    	   System.out.println(regList);
    	    for(Map<String,String>e: regList) {
    	    	String username=e.get("Username");
    	    	rp.invalidUsername(username);
    	    	rp.clickRegister();
    	    	  LoggerLoad.info("User clicks Register button after entering a username with spacebar characters other than digits and special char ");
    	    }
    }

    @Then("The user is not able to see error msg after entering invalid data")
    public void the_user_is_not_able_to_see_error_msg_after_entering_invalid_data() {
        rp.foundBUG();
        LoggerLoad.error("The user is not able to see error msg after entering invalid data");
    }
    @When("The user clicks Register button after entering a password with numeric data")
    public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data(DataTable dataTable) {
    	List<Map<String,String>> regList=dataTable.asMaps(String.class,String.class);
    	   System.out.println(regList);
    	    for(Map<String,String>e: regList) {
    	    	String username=e.get("Username");
    	    	String pwd=e.get("Password");
    	    	rp.enternumericPwdonly(username, pwd);
    	    	rp.clickRegister();
    	    	LoggerLoad.info(" User clicks Register button after entering a password with numeric data");
    	    }
    }
    @Then("The user redirected to empty password confirmation textbox")
    public void the_user_redirected_to_empty_password_confirmation_textbox() {
    	LoggerLoad.info(" User redirected to empty password confirmation textbox");
    }

    @Then("The user redirected to empty password textbox")
    public void the_user_redirected_to_empty_password_textbox() {
       rp.foundBUG();
       LoggerLoad.error("User redirected to empty password textbox after entering only numeric data in pwd text box");
       
    }

    @When("The user clicks Register button after entering a Password with characters less than eight")
    public void the_user_clicks_register_button_after_entering_a_password_with_characters_less_than(DataTable dataTable) {
     
    	List<Map<String,String>> regList=dataTable.asMaps(String.class,String.class);
   System.out.println(regList);
    for(Map<String,String>e: regList) {
    	String username=e.get("Username");
    	String pwd=e.get("Password");
    	rp.enterlessthan8charpwd(username, pwd);
    	rp.clickRegister();
    	LoggerLoad.info(" ser clicks Register button after entering a Password with characters less than eight");
    }
    }  

    

    @When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
    public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(DataTable dataTable) {
    	List<Map<String,String>> regList=dataTable.asMaps(String.class,String.class);
    	   System.out.println(regList);
    	    for(Map<String,String>e: regList) {
    	    	String username=e.get("Username");
    	    	String pwd=e.get("Password");
    	    	String cpwd=e.get("Password confirmation");
    	    	rp.enterUsernameDiffPasswordConfpwd(username, cpwd, pwd);
    	    	rp.clickRegister();
    	    	LoggerLoad.info("User clicks Register button after entering different passwords in Password and Password Confirmation fields");
    	    }
    }

    @Then("The user should able to see an pwd warning message {string}")
    public void the_user_should_able_to_see_an_pwd_warning_message(String expwarnMsg) {
        
       String actwarnMsg= rp.getErrorMsg();
       Assert.assertEquals(actwarnMsg,expwarnMsg);
       LoggerLoad.warn("user should able to see an warning message ");
    }
    @When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
    public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes(DataTable dataTable) {
    	List<Map<String,String>> regList=dataTable.asMaps(String.class,String.class);
    	   System.out.println(regList);
    	    for(Map<String,String>e: regList) {
    	    	String username=e.get("Username");
    	    	String pwd=e.get("Password");
    	    	String cpwd=e.get("Password confirmation");
    	    	rp.enterValidUnamePwdCpwd(username, cpwd, pwd);
    	    	rp.clickRegister();
    	    	 LoggerLoad.info("User clicks Register button after entering  with valid username, password and password confirmation in related textboxes");
    	    }
    	    }

    
    @Then("The user should be redirected to Home Page of DS Algo")
    public void the_user_should_be_redirected_to_home_page_of_ds_algo() {

String url=BaseClass.getCurrentUrl();
System.out.println("The current url: "+url);
LoggerLoad.info("User  redirected to Home Page of DS Algo");

    }

    @Then("The user should able to see  successful message {string}  on  the DS Algo Home Page")
    public void the_user_should_able_to_see_succeful_message_on_the_ds_algo_home_page(String expSucMsg) {
        
      String actSucMsg=  hp.getAccountSuccessMsg();
      Assert.assertEquals(actSucMsg,expSucMsg);
      LoggerLoad.info("User is able to see  successful message");
    }

    @Given("The user is on the DS Algo Home Page")
    public void the_user_is_on_the_ds_algo_home_page() {
    	
    	 hp=new HomePage_PF(BaseClass.getDriver());
    	 String url= BaseClass.getCurrentUrl();
         System.out.println(url);
         LoggerLoad.info("User is on the DS Algo Home Page"); 
    }

    @When("The user clicks the Sign out link")
    public void the_user_click_the_sign_out_link() {
        hp.clickSignout();
        LoggerLoad.info("User is on the DS Algo Home Page"); 
    }

    @Then("The user able to see  {string} message")
    public void the_user_able_to_see_message(String expMsg) {
       
      String actMsg= hp.getloggedOutsMsg();
      Assert.assertEquals(actMsg,expMsg);
      LoggerLoad.info("User sees message"); 
    }
}

//tryhere
    
//    @Given("^open browser page$")
//    public void open_browser_page() throws IOException {
//        BaseClass.setUp();
//        BaseClass.openPage("https://dsportalapp.herokuapp.com/tryEditor");
//
//        ap=new Arrays_PF(BaseClass.getDriver());
//    }
//
//    @When("^enter thr code$")
//    public void enter_thr_code() {
//    	ap.blankEditor();
//    	ap.clickArraysRun();
//    	ap.enterInvalidCode();
//    	ap.enterValidCode();
//
//    }
//
//    @When("^click the RUN button$")
//    public void click_the_run_button() {
//    	ap.clickArraysRun();
//    }
//
//
//
//    @Then("^I validate the outcomes$")
//    public void i_validate_the_outcomes() {
//       
//        ap.getConsoleOutput();
//        
//    }
//
//
//}
//
