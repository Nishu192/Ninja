package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	@FindBy(xpath="//a[text()=\"Data Structures\"]") WebElement lnk_dataStructureDropdown ;
	@FindBy(xpath="//a[text()=\"Arrays\"]") WebElement lnk_array;
	@FindBy(xpath="//a[text()=\"Linked List\"]") WebElement lnk_linkedList;
	@FindBy(xpath="//a[text()=\"Stack\"]") WebElement lnk_stack;
	@FindBy(xpath="//a[text()=\"Queue\"]") WebElement lnk_queue;
	@FindBy(xpath="//a[text()=\"Tree\"]") WebElement lnk_tree ;
	@FindBy(xpath="//a[text()=\"Graph\"]") WebElement lnk_graph ;
	@FindBy(xpath="//h5[text()=\"Queue\"]/../a") WebElement btn_queue_getStarted;
	@FindBy(xpath="//h5[text()=\"Data Structures-Introduction\"]/../a")WebElement lnk_DataStructureGetstarted;
	@FindBy(xpath="//h4[text()=\"Data Structures-Introduction\"]")WebElement txt_LinkedListTitle;
	@FindBy(xpath="//h5[text()=\"Array\"]/../a")WebElement lnk_ArraysGetstarted;
	@FindBy(xpath="//h5[text()=\"Tree\"]/../a")WebElement lnk_TreeGetstarted;
	@FindBy(xpath="//h5[text()=\"Stack\"]/../a")WebElement lnk_stackGetstarted;
	@FindBy(xpath="//h5[text()=\"Graph\"]/../a")WebElement lnk_GraphGetstarted;	
	@FindBy(xpath="//a[text()=\"Sign out\"]/../a[2]") WebElement lnk_name;
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement lnk_SignOut;
	@FindBy(xpath="//div[@role=\"alert\"]")  WebElement text_alertMsg;
	@FindBy(xpath="//div[@role=\"alert\"]") WebElement txt_successmsg;
	@FindBy(xpath="/html/body/div[2]") WebElement txt_logOutMsg;
	public WebDriver driver;
	
	public HomePage_PF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public boolean enabledsignout() {
		return lnk_SignOut.isEnabled();
	}
	
	public void clickSignout() {
		lnk_SignOut.click();
	}
	public String getLinkedListTitle() {
		String smg=	 txt_LinkedListTitle.getText();
		System.out.println("The user should see title of the page: "+smg);
		return smg;
		
		}
	public String getloggedOutsMsg() {
		String smg=	 txt_logOutMsg.getText();
		System.out.println("The user should see logged out message after clicking sign out link: "+smg);
		return smg;
		}
	public String getAccountSuccessMsg() {
		
String smg=	txt_successmsg.getText();
	System.out.println("The user should see account created successful message after entering valid credentials: "+smg);
	return smg;
	}
	public void clickDSdropDown() {
		lnk_dataStructureDropdown.click();
	}
public void clickArray() {
	 lnk_ArraysGetstarted.click();
	}
public void clickLinkedList() {
	
}
public void clickStack () {
	
}
public void clickTree() {
	
}
public void clickGraph() {
	
}

public void clickQueue() {
		
	}
public void clickArrayGetStarted() {
	
}
public void clickLinkedlistGetStarted () {
	
}
public void clickStackGetStarted() {
	
}
public void clickQueueoGetStarted() {
	
}
public void clickTreeGetStarted() {
	
}
public void clickGraphGetStarted() {
	
}
public void clickDSintroGetStarted() {
}

}
