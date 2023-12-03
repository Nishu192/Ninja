package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseClass;
public class DSTryhere_PF extends BaseClass {
  WebDriver driver;
 
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement txt_codeEditor ;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement btn_run;
	
	@FindBy(xpath="//pre[@id='output']")
	WebElement outputConsole;
	 
		
	public DSTryhere_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void acceptAlertMsg()  {
		//WebDriverWait wait = new WebDriverWait(driver, 12);
		
		//wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
	}

	
	public void clearEditor() {
		Actions act=new Actions(driver);
		//int x=txt_codeEditor.getLocation().getX();
		//int y=txt_codeEditor.getLocation().getY();
		act.moveToElement(txt_codeEditor).click().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.DELETE).perform();
		act.keyUp(Keys.DELETE).perform();
		
		/*act.moveToElement(outputConsole).click().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.DELETE).perform();
		act.keyUp(Keys.DELETE).perform();*/
		
		//act.scrollByAmount(54, 22).keyDown(Keys.CONTROL).keyDown(Keys.DELETE).keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
		System.out.println("Editor screen is cleared.");
		
//		act.scrollByAmount(54, 22).()
//		)
	}
	
	public void enterValidCode(String inputfromExcel)
	{
		if(txt_codeEditor.isDisplayed())
		{
				Actions action=new Actions(driver);
				action.sendKeys(txt_codeEditor,inputfromExcel).perform();
							
		}
	}
	
	
	public void enterInvalidCode(String inputfromExcel)
	{
		if(txt_codeEditor.isDisplayed())
		{
				Actions action=new Actions(driver);
				action.sendKeys(txt_codeEditor,inputfromExcel).perform();
							
		}
	}
	
	public void blankEditor()
	{
		if(txt_codeEditor.isDisplayed())
		{
				Actions action=new Actions(driver);
				action.sendKeys(txt_codeEditor,"").perform();
							
		}
	}
	
	public void clickRun() 
	{
			btn_run.click();
	}
	
	
	public void getConsoleOutput() {
		String output=outputConsole.getText();
		System.out.println("The User able to see result in the console: "+output);
	}

	public void clickTryhere() {
		// TODO Auto-generated method stub
		
	}
	
}