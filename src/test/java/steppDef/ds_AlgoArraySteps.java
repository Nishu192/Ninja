package steppDef;
import io.cucumber.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Arrays_PF;
import pages.DSTryhere_PF;
import pages.HomePage_PF;
import utilities.BaseClass;
import utilities.LoggerLoad;

public class ds_AlgoArraySteps extends BaseClass {

	HomePage_PF hp;
	Arrays_PF ap;
	DSTryhere_PF th;
	
	
	@When("The user clicks  {string} button below the array")
	public void the_user_clicks_button_below_the_array(String string) {
		
		hp=new HomePage_PF(BaseClass.getDriver());
	    ap=new Arrays_PF(BaseClass.getDriver());
	   hp.clickArray();
	   LoggerLoad.info("User clicks  Get Started button below the array");
	   
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String expT) {
	   String tl= ap.getArraypageTitle();
	  Assert.assertEquals(expT,tl);
	  LoggerLoad.info("User is on the Array page");
	}
	@Given("The  user is on the Array  page")
	public void the_user_is_on_the_array_page() {
		  ap=new Arrays_PF(BaseClass.getDriver());
	}

	@When("The user clicks a Arrays in Python link")
	public void the_user_clicks_a_arrays_in_python_link() {
	    ap.clickArraysInPython();
	    LoggerLoad.info("User clicks - Arrays in Python link");
	}

	@Then("The user should be redirected to {string} AP Page")
	public void the_user_should_be_redirected_to_page1(String expT) {
		 String tl=  ap.getArrayinPythonTitle();
		  Assert.assertEquals(expT,tl);
		  LoggerLoad.info("User is on - Arrays in Python");

	}

	@Given("The user is on the Array in Python Page")
	public void the_user_is_on_the_array_in_python_page() {
		
		  ap=new Arrays_PF(BaseClass.getDriver());
	}

	@When("The user clicks Try Here button of Array in Python Page")
	public void the_user_clicks_try_here_button_of_array_in_python_page() {
	    ap.clickTryhere();
	  String Url=BaseClass.getCurrentUrl();
	  System.out.println(Url);
	  LoggerLoad.info("User clicks Try Here button of Array in Python Page");
	}
	@Then("The user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String expUrl) {
		String url1=BaseClass.getCurrentUrl();
		System.out.println("The url of python editor is : "+url1);
		  Assert.assertEquals(url1,expUrl);
		  LoggerLoad.info("User is on Python Editor");
	}

//	@Then("The user should be redirected to a page having an Python Editor with url {string}")
//	public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_url(String string) {
//	    
//String url=BaseClass.getCurrentUrl();
//System.out.println("The url of python editor is : "+url);
//
//	}
	@When("The user clicks a Arrays Using List link")
	public void the_user_clicks_a_arrays_using_list_link() {
		
		//BaseClass.NavBack();
	    ap.clickArraysUsingList();
	    LoggerLoad.info("User clicks Arrays Using List link");
	}

	@Then("The user should be redirected to {string} AL page.")
	public void the_user_should_be_redirected_to_page11(String expT) {
	  String tl=  ap.getarraysUsingListTitle();
	    Assert.assertEquals(expT,tl);
	    LoggerLoad.info("User is on Arrays Using List");
	}
	@Given("The  user is on the Array  Using List page")
	public void the_user_is_on_the_array_using_list_page() {
		 ap=new Arrays_PF(BaseClass.getDriver());
	}

	@When("The user clicks Try Here button of Array Using List Page")
	public void the_user_clicks_try_here_button_of_array_using_list_page() {
	    ap.clickTryhere();
	    LoggerLoad.info("User clicks  Try Here button of Array Using List");
	}
	@When("The user clicks a Basic Operations in Lists  link")
	public void the_user_clicks_a_basic_operations_in_lists_link() {
		// BaseClass.NavBack();
	   ap.clickArraysBasicOp();
	   LoggerLoad.info("User clicks  a Basic Operations in Lists ");
	}

	@Then("The user should be redirected to {string} BO page.")
	public void the_user_should_be_redirected_to_bo_page(String expMsg) {
	    String actmsg=ap.getArraysBasicOPTitle();
	    Assert.assertEquals(expMsg,actmsg);
	    LoggerLoad.info("User is on Basic Operations page");
	}
	@Given("The  user is on the  Basic Operations in Lists   page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		 ap=new Arrays_PF(BaseClass.getDriver());
		 //BaseClass.NavBack();
	}

	@When("The user clicks Try Here button of Operations in Lists Page")
	public void the_user_clicks_try_here_button_of_operations_in_lists_page() {
	    ap.clickTryhere();
	    LoggerLoad.info("User clicks  Try Here button of Operations in Lists");
	}

	

	@When("The user clicks an Applications of Array link")
	public void the_user_clicks_an_applications_of_array_link() {
	    ap.clickArraysApp();
	    LoggerLoad.info("User clicks an Applications of Array link");
	    
	}

	@Then("The user should be redirected to {string} AA page.")
	public void the_user_should_be_redirected_to_aa_page(String expT) {
	  String tl= ap.getArraysAppTitle();
	   Assert.assertEquals(expT,tl);
	   LoggerLoad.info("User is on Applications of Array page");
	}
	@Given("The  user is on the  Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
		 ap=new Arrays_PF(BaseClass.getDriver());
		 
	}

	@When("The user clicks Try Here button of Application of Array page")
	public void the_user_clicks_try_here_button_of_application_of_array_page() {
	    ap.clickTryhere();
	    LoggerLoad.info("User clicks  Try Here button of Application of Array");
	}


	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		// BaseClass.NavBack();
	    ap.clickArraysPracticeQuestions();
	    LoggerLoad.info("User clicks Practice Questions link");
	}

	
	@Then("The user should be redirected to practice page having links like {string},{string},{string} ,{string}")
	public void the_user_should_be_redirected_to_practice_page_having_links_like(String expSt, String expMct, String expEnt, String expSst) {
	   	
		String t1=    ap.getarraysSearchTitle();
		String t2=     ap.getarraysMaxConsecutivesTitle();
		String t3=     ap.getarraysEvennumbersTitle();
		String t4=    ap.getlnk_arraysSortedSquaresTitle();
		    Assert.assertEquals(expSt,t1);
		    Assert.assertEquals(expMct,t2);
		    Assert.assertEquals(expEnt,t3);
		    Assert.assertEquals(expSst,t4);
		    LoggerLoad.info("User is on practice page");
	}


	@Given("The user is on Practice page")
	public void the_user_is_on_practice_page() {
		 ap=new Arrays_PF(BaseClass.getDriver());
	}

	@When("The user clicks search the array  link")
	public void the_user_clicks_search_the_array_link() {
	    ap.clickArraysSearch();
	    LoggerLoad.info("User clicks array  link");
	}

	@Then("The user should be redirected to {string} page contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_page_contains_a_question_an_try_editor_with_run_and_submit_buttons(String expT) {
	 String tl=  ap.gettxtQuestionTitle();
	   Assert.assertEquals(expT,tl);
	    LoggerLoad.info("User is on Python Editor page");
	}

	@When("The user clicks Max consecutive ones link")
	public void the_user_clicks_max_consecutive_ones_link() {
		BaseClass.NavBack();
	   ap.clickArraysMaxConsecutives();
	   LoggerLoad.info("User clicks Max consecutive ones  link");
	}

	@When("The user clicks Find numbers with even number of digits link")
	public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
	BaseClass.NavBack();
		   ap.clickArraysEvennumbers();
		   LoggerLoad.info("User clicks Find numbers with even number of digits link");
	}
	@When("The user clicks squared of the sorted array link")
	public void the_user_clicks_squared_of_the_sorted_array_link() {
		BaseClass.NavBack();
		   ap.clickArraysSortedSquares();
		   LoggerLoad.info("User clicks squared of the sorted array link");
	}
	@Given("The user comes back to the DS_algo home page to select or start DS Linked List.")
	public void the_user_comes_back_to_the_ds_algo_home_page_to_select_or_start_ds_linked_list() {
		hp=new HomePage_PF(BaseClass.getDriver());
		BaseClass.navigateToUrl("https://dsportalapp.herokuapp.com/home");
		LoggerLoad.info("User is on Home page");
	}

	@When("The user select Linked List from the Data Structure dropdown menu or or clicks the Get Started button in Linked List Panel")
	public void the_user_select_linked_list_from_the_data_structure_dropdown_menu_or_or_clicks_the_get_started_button_in_linked_list_panel() {
	    hp.clickLinkedlistGetStarted();
	    LoggerLoad.info("User selects any option from the Data Structure dropdown menu ");
	}

	@Then("The user should be redirected to {string} LL page.")
	public void the_user_should_be_redirected_to_ll_page(String expT) {
	  String tl=  hp.getLinkedListTitle();
	    Assert.assertEquals(expT,tl);
	    LoggerLoad.info("User is on Linked List page");
	}

	@Given("The user is already on Python Editor page")
	public void the_user_is_already_on_python_editor_page() {
	th=	new DSTryhere_PF(BaseClass.getDriver());
		ap=new Arrays_PF(BaseClass.getDriver());
	}

	
	

	@When("User clicks the submit button int try editor")
	public void user_clicks_the_submit_button_int_try_editor() {
	   ap.clickSubmitbtn();
	   
	}



	@Then("User gets an warning message {string} in the console")
	public void user_gets_an_warning_message_in_the_console(String ExpErMsg) throws InterruptedException {
		 
			
		String ActErMsg= ap.getErrorSubmitMsg(); 
		  Assert.assertEquals(ActErMsg,ExpErMsg);
	}

}
