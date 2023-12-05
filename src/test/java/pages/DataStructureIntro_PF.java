package pages;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DataStructureIntro_PF {

	@FindBy(xpath="//h5[text()=\"Data Structures-Introduction\"]/../a") WebElement lnk_dataStructure_getStarted;
	@FindBy(xpath="//a[text()=\"Time Complexity\"]") WebElement lnk_timeComplexity; 
	@FindBy(xpath="//h4[text()=\"Data Structures-Introduction\"]") WebElement txt_DataStrctIntroTitle;
	@FindBy(xpath="//p[text()=\"Time Complexity\"]") WebElement text_TimeComplexity;
	@FindBy(xpath="//*[@id=\"content\"]/a") WebElement lnk_PracticeQuestions;
	
	WebDriver driver;
	
	public DataStructureIntro_PF (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickPracticeQuestions() {
lnk_PracticeQuestions.click();

	}
	public void ClickDStimeComplexity() {
		
		lnk_timeComplexity.click();
	}
	
	public void clickDataStructGetstarted() {
	lnk_dataStructure_getStarted.click();
}
	public String getMsgDataStrctIntroTitle() {
		String msg=txt_DataStrctIntroTitle.getText();
		System.out.println("The user sees the subtitle of the page"+msg);
		return msg;
	}
	public String getMsgTimeComplexity() {
		String msg=text_TimeComplexity.getText();
		System.out.println("The user sees the subtitle of the page"+msg);
		return msg;
	}
	
}
