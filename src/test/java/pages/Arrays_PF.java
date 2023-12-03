package pages;
//import org.openqa.selenium.Keys;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Arrays_PF {
	
	private  WebDriver driver;
	@FindBy(xpath="//a[text()=\"Arrays in Python\"]") WebElement lnk_arraysInPython ;
	@FindBy(xpath="//a[text()=\"Arrays Using List\"]") WebElement lnk_arraysUsingList ;
	@FindBy(xpath="//div[2]/div/div[2]/strong/p") WebElement txt_arraysUsingListTitle ;
	@FindBy(xpath="//a[text()=\"Basic Operations in Lists\"]") WebElement  lnk_arraysBasicOP;
	@FindBy(xpath="//p[text()=\"Basic Operations in Lists\"]") WebElement  txt_ArraysBasicOPTitle;
	@FindBy(xpath="//a[text()=\"Applications of Array\"]") WebElement lnk_arraysApp ;
	@FindBy(xpath="//p[text()=\"Applications of Array\"]") WebElement txt_arraysAppTitle ;
	@FindBy(xpath="//a[text()=\"Try here>>>\"]") WebElement  lnk_TryHere;
	@FindBy(xpath="//*[@id=\"answer_form\"]/button") WebElement  btn_arraysPy_Run;
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement txt_arraysPy_Editor ;
	@FindBy(id="output") WebElement consoleOutput;
	@FindBy(xpath="//a[text()=\"Arrays in Python\"]") WebElement txt_arrayInPython;
	@FindBy(xpath="//a[text()=\"Practice Questions\"]") WebElement lnk_arraysBasicQ ;
@FindBy(xpath="//a[text()=\"Search the array\"]") WebElement lnk_arraysSearch ;
@FindBy(xpath="//strong[text()=\"QUESTION\"]") WebElement txt_Question;

@FindBy(xpath="//a[text()=\"Max Consecutive Ones\"]") WebElement lnk_arraysMaxConsecutives ;
@FindBy(xpath="//a[text()=\"Find Numbers with Even Number of Digits\"]") WebElement lnk_arraysEvennumbers ;
@FindBy(xpath="//a[text()=\"Squares of  a Sorted Array\"]") WebElement lnk_arraysSortedSquares ;
@FindBy(xpath="//button[text()=\"Run\"]") WebElement btn_arrays_run ;
@FindBy(xpath="//input[@value=\"Submit\"]") WebElement btn_arrays_submit ;
@FindBy(xpath="//form[@id=\"answer_form\"]/../div") WebElement  txt_arrays_errormsg;
@FindBy(xpath="//h4[text()=\"Array\"]") WebElement txt_Array;


public Arrays_PF (WebDriver driver) {
this.driver=driver;
	PageFactory.initElements(driver,this);
}
public String gettxtQuestionTitle() {
	String msg=txt_Question.getText();
	System.out.println("The user able to see Title: "+msg);
	return msg;
}


public String getlnk_arraysSortedSquaresTitle() {
	String msg=lnk_arraysSortedSquares.getText();
	System.out.println("The user able to see Link4: "+msg);
	return msg;
}
public String getarraysEvennumbersTitle() {
	String msg=lnk_arraysEvennumbers.getText();
	System.out.println("The user able to see  Link3: "+msg);
	return msg;
}

public String getarraysMaxConsecutivesTitle() {
	String msg=lnk_arraysMaxConsecutives.getText();
	System.out.println("The user able to see  Link2: "+msg);
	return msg;
}
public String getarraysSearchTitle() {
	String msg=lnk_arraysSearch.getText();
	System.out.println("The user able to see  Link1: "+msg);
	return msg;
}

public String getArraysAppTitle() {
	String msg=txt_arraysAppTitle.getText();
	System.out.println("The user able to see Title: "+msg);
	return msg;
}
 
public String getArraysBasicOPTitle() {
	String msg=txt_ArraysBasicOPTitle.getText();
	System.out.println("The user able to see Title: "+msg);
	return msg;
}

public String getarraysUsingListTitle() {
	String msg=txt_arraysUsingListTitle.getText();
	System.out.println("The user able to see Title: "+msg);
	return msg;
}
public String getRunBtnTxt() {
	String msg=btn_arraysPy_Run.getAttribute(getRunBtnTxt());
	System.out.println("The user able to see Title: "+msg);
	return msg;
}
public String getArrayinPythonTitle() {
	String msg=txt_arrayInPython.getText();
	System.out.println("The user able to see Title: "+msg);
	return msg;
}
public String getArraypageTitle() {
	String msg=txt_Array.getText();
	System.out.println("The user able to see Title: "+msg);
	return msg;
}
public void acceptAlertMsg() {
	driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
}
public void clickArraysInPython() {
	lnk_arraysInPython.click();
}
public void clickArraysUsingList() {
	lnk_arraysUsingList.click();
}
public void clickArraysBasicOp() {
	lnk_arraysBasicOP.click();
}
public void clickArraysApp() {
	lnk_arraysApp.click();
}
public void clickTryhere() {
	lnk_TryHere.click();
}
public void blankEditor() {
	Actions act=new Actions(driver);
	act.scrollByAmount(54, 22).click().sendKeys("");
}
//public void enterValidCode() {
//	
//	double s=txt_arraysPy_Editor.getLocation().x;
//double t=txt_arraysPy_Editor.getLocation().y;
//
//System.out.println(+s+ "and "+t);
//	
//Actions act=new Actions(driver);
//act.scrollByAmount(54, 22).click().sendKeys( txt_arraysPy_Editor , "# Python Program to find the area of triangle\r\n"
//		+ "\r\n"
//		+ "a = 5\r\n"
//		+ "b = 6\r\n"
//		+ "c = 7\r\n"
//		+ "\r\n"
//		+ "# Uncomment below to take inputs from the user\r\n"
//		+ "# a = float(input('Enter first side: '));\r\n"
//		+ "# b = float(input('Enter second side: '));\r\n"
//		+ "# c = float(input('Enter third side: '));\r\n"
//		+ "\r\n"
//		+ "# calculate the semi-perimeter\r\n"
//		+ "s = (a + b + c) / 2\r\n"
//		+ "\r\n"
//		+ "# calculate the area\r\n"
//		+ "area = (s*(s-a)*(s-b)*(s-c)) ** 0.5\r\n"
//		+ "print('The area of the triangle is %0.2f' %area)\r\n"
//		+ "").perform();	
//}
public void getConsoleOutput() {
	
	String omg= consoleOutput.getText();
	System.out.println("The User able to see result in the console: "+omg);
}
//public void clearEditor() {
//	Actions act=new Actions(driver);
//	act.scrollByAmount(54, 22).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//	act.scrollByAmount(54, 22).keyDown(Keys.CONTROL).keyDown(Keys.DELETE).keyUp(Keys.CONTROL).keyUp(Keys.DELETE).perform();
//	
//}
//public void enterInvalidCode() {
//	double s=txt_arraysPy_Editor.getLocation().x;
//	double t=txt_arraysPy_Editor.getLocation().y;
//
//	System.out.println(+s+ "and "+t);
//		
//	Actions act=new Actions(driver);
//	try {
//		act.scrollByAmount(54, 22).click().sendKeys( txt_arraysPy_Editor , "# Python Program to find the area of triangle\r\n"
//				+ "\r\n"
//				+ "a = 5\r\n"
//				+ "b = 6\r\n"
//				+ "c = 7\r\n"
//				+ "\r\n"
//				+ "# Uncomment below to take inputs from the user\r\n"
//				+ "# a = float(input('Enter first side: '));\r\n"
//				+ "# b = float(input('Enter second side: '));\r\n"
//				+ "# c = float(input('Enter third side: '));\r\n"
//				+ "\r\n"
//				+ "# calculate the semi-perimeter\r\n"
//				+ "s = (a + b + c) =2\r\n"
//				+ "\r\n"
//				+ "# calculate the area\r\n"
//				+ "area = (s*(s-a)*(s-b)*(s-c)) ** 0.5\r\n"
//				+ "print('The area of the triangle is %0.2f' %area)\r\n"
//				+ "").perform();
//		 clickArraysRun();
//		
//		acceptAlertMsg();
//	} 
//	
//	 catch (Exception e) {
//		driver.navigate().to("https://dsportalapp.herokuapp.com/tryEditor");
//	}
//		
//}


public void clickArraysRun() {
	btn_arrays_run.click();
	double s1=btn_arrays_run.getLocation().x;
	double t1=btn_arrays_run.getLocation().y;

	System.out.println(+s1+ "and "+t1);
	Actions act1=new Actions(driver);

	act1.scrollByAmount(12,369).click().perform();
	
}

public void clickArraysPracticeQuestions() {
	lnk_arraysBasicQ.click();
}
public void clickArraysSearch() {
	lnk_arraysSearch.click();
}

public void clickArraysMaxConsecutives() {
	lnk_arraysMaxConsecutives.click();
}
public void clickArraysSortedSquares() {
	lnk_arraysSortedSquares.click();
}
public void clickArraysEvennumbers() {
	lnk_arraysEvennumbers.click();
}

}
