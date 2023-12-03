package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DSIntro_PF {

	@FindBy(xpath="//a[text()=\"Data Structures\"]") WebElement lnk_dataStructure ;
	@FindBy(xpath="//div[@class=\"dropdown-menu show\"]") List<WebElement> menu_DS;
	@FindBy(xpath="//a[text()=\"Arrays\"]") WebElement lnk_arrays;
	@FindBy(xpath="//a[text()=\"Linked List\"]") WebElement lnk_linkedList;
	@FindBy(xpath="//a[text()=\"Stack\"]") WebElement lnk_stack;
	@FindBy(xpath="//a[text()=\"Queue\"]") WebElement lnk_queue;
	@FindBy(xpath="//a[text()=\"Tree\"]") WebElement lnk_tree ;
	@FindBy(xpath="//a[text()=\"Graph\"]") WebElement lnk_graph ;
	@FindBy(xpath="//h5[text()=\"Queue\"]/../a") WebElement btn_queue_getStarted;
	@FindBy(xpath="//a[text()=\"Sign in\"]") WebElement lnk_signin;
@FindBy(xpath="//a[text()=\" Register \"]") WebElement lnk_register;
@FindBy(xpath="//h5[text()=\"Array\"]/../a")WebElement lnk_ArraysGetstarted;
@FindBy(xpath="//div[@role=\"alert\"]")WebElement txtAlertMsg;

WebDriver driver;

public DSIntro_PF(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}
public void clickLinkedListDropdown() {
	lnk_linkedList.click();
}
public String getTxtAlertMsg() {
	String msg=txtAlertMsg.getText();
	System.out.println("The User sees an AlertMessage when user is not signed in: "+msg);
	return msg;
}
public void clickDSDropdown() {
	lnk_dataStructure .click();
}



public String getMenuOptions(String  list) {

	 for(WebElement i: menu_DS) {
		
		 System.out.println(i.getText());
		  
	 }
	 
	return list;	 }

public String gettxtReg() {
	String rg=lnk_register.getText();
	System.out.println("The user sees text message after clicking getstarted button: "+rg);
	return rg;
}
public String getTxtSn() {
	String sn=lnk_signin.getText();
	System.out.println("The user sees text message after clicking getstarted button: "+sn);
	return sn;
}
public void clickSignin() {
	lnk_signin.click();
	}
public void clickRegister() {
	lnk_register.click();
	
}


}
