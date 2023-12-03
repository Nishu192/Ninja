package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_PF {
	
	@FindBy(name="username") WebElement txt_username; 
	@FindBy(name="password") WebElement txt_password;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[4]") WebElement button_login ;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/a") WebElement register_link;
	@FindBy(xpath="/html/body/div[3]") WebElement warnMsg_text;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/text()")  WebElement btmMsg;
	@FindBy(xpath="//div[@role=\"alert\"]")  WebElement LoggedInmsg;

	public Signin_PF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String getLoggedInmsg() {
		String msg=LoggedInmsg.getText();
		System.out.println("The user able to see successful logged in message : "+msg);
		return msg;
		
	}
	
	public String getBtmTextmsg() {
		String msg=btmMsg.getText();
		System.out.println(msg);
		return msg;
		
	}
	public void enterPwdonly(String pwd) {
		txt_username.clear();
		txt_password.sendKeys(pwd);
	}
	public void blankUsernameAndBlankPassword() {
		
		}
	public void enterUsernameOnly(String uname,String pwd) {
		txt_username.sendKeys(uname);
		
		
	}
	public void invalidUsernamePwd(String uname,String pwd) {
		txt_username.sendKeys(uname);
		txt_password.sendKeys(pwd);
		
	}
	public void validUsernameAndInvalidPassword(String uname,String pwd) {
		txt_username.sendKeys(uname);
		txt_password.sendKeys(pwd);
		
	}
	public void validUsernameAndBlankPassword(String uname,String pwd) {
		txt_username.sendKeys(uname);
		txt_password.sendKeys(pwd);
		
	}
	public String getWarnMsg() {
		String msgW=warnMsg_text.getText();
		System.out.println("The user gets warning msg after entering valid username and invalid username:"+msgW);
		return msgW;
		
	}
	
public String getSignpageMsg() {
	String m=register_link.getText();
	System.out.println("The User sees the link below text boxex : "+m);
	return m;
}
public void ClickLogin() {
	button_login.click();
	
}
public String getTiptoolSinWarnMsg() {
	String Wmsg=	txt_username.getAttribute("validationMessage");
	System.out.println("The User able to see tootip message below inbox text box:  "+Wmsg);
	return Wmsg;
}
public String getTiptoolpwrdWarnMsg() {
	String Wmsg=	txt_password.getAttribute("validationMessage");
	System.out.println("The User able to see tootip message below inbox text box:  "+Wmsg);
	return Wmsg;
}


}