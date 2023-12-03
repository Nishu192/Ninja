package pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 public class DS_AlgoPortal_PF {	

	@FindBy(xpath="//button[text()='Get Started']") WebElement btn_getStarted ;
	@FindBy(xpath="//div[@class=\"content\"]/p") WebElement text_portalMsg;

	public WebDriver driver;
	
	public DS_AlgoPortal_PF(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickGetStarted() {
		btn_getStarted.click();
	}
	
public String portalTitle() {
	return driver.getTitle();
	
}

public boolean isGetstartedLinkExist() {
	return btn_getStarted.isDisplayed();
}

public boolean isPortalMsgDisplayed() {
	
	return text_portalMsg.isDisplayed();
}

public String portalMsg() {
	String pm=text_portalMsg.getText();
	System.out.println("The portal Message : "+pm);
	return pm;
}
}
