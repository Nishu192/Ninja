package pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_PF {
	 public WebDriver driver;
	@FindBy(name="username") WebElement  txt_username;
	@FindBy(name="password1") WebElement txt_password1 ;
	@FindBy(name="password2") WebElement txt_password2 ;
	@FindBy(xpath="//input[@value=\"Register\"]") WebElement btn_login ;
	@FindBy(xpath="//input[@value=\"Register\"]") WebElement lnk_register ;
@FindBy(xpath="/html/body/div[2]/div/div[2]/text()[1]")WebElement txt_msg1;
@FindBy(xpath="//a[text()=\"Login \"]")WebElement txt_msg2;
@FindBy(xpath="/html/body/div[2]/div/div[2]/text()[2]")WebElement txt_msg3;
@FindBy(xpath="//div[@role=\"alert\"]")WebElement txt_mismatchPwd;

	
	public Registration_PF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickRegister() {
		lnk_register.click();
		
	}
	public void enterValidUnamePwdCpwd(String uname,String pwd, String cpwd){
		txt_username.sendKeys(uname);
		txt_password1.sendKeys(pwd);
		txt_password2.sendKeys(cpwd);
	}
	public String getErrorMsg() {
		String ms=txt_mismatchPwd.getText();
		System.out.println("The User sees the link at the bottom of the page: "+ms);
		return ms;
	}
	public String getloginMsg() {
		
		String m2=txt_msg2.getText();
		
		System.out.println("The User sees the link at the bottom of the page: "+m2);
		return m2;
		
	}
	public void allBlank() {
		
	
	}
	
	
	
public void enterOnlyUsername(String uname){
	txt_username.sendKeys(uname);
	
}
public void enterUsernamePassword(String uname,String pwd) {
	txt_username.sendKeys(uname);
	txt_password1.sendKeys(pwd);
	
}

public void enterUsernameDiffPasswordConfpwd(String uname,String pwd, String cpwd ){
	txt_username.sendKeys(uname);
	txt_password1.sendKeys(pwd);
	txt_password2.sendKeys(cpwd);
}

public void invalidUsername(String uname) {
	txt_username.sendKeys(uname);
	
}
public void enternumericPwdonly(String uname,String pwd) {
	txt_username.sendKeys(uname);
	txt_password1.sendKeys(pwd);

}
public void enterlessthan8charpwd(String uname,String pwd) {
	txt_username.sendKeys(uname);
	txt_password1.sendKeys(pwd);

	
}


public void foundBUG() {
	System.out.println("Not showing error message after entering invalid credential so this is the BUG");
}
public String getTiptoolSinMsg() {
	String msg=	txt_username.getAttribute("validationMessage");
	System.out.println("The User able to see tootip message below inbox text box:  "+msg);
	return msg;
}
public String getTiptoolPwdMsg() {
	String msg=	txt_password1.getAttribute("validationMessage");
	System.out.println("The User able to see tootip message below pwd text box:  "+msg);
	return msg;
}
public String getTiptoolConfPwdMsg() {
	String msg=	txt_password2.getAttribute("validationMessage");
	System.out.println("The User able to see tootip message below Confirm pwd text box:  "+msg);
	return msg;
}



}
