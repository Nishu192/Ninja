package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DSEditorRun_PF {
	@FindBy(xpath="//pre[@role=\"presentation\"]/span")WebElement txt_dsTimecomp_Editor;
	@FindBy(xpath="//button[text()='Run']") WebElement btn_dsTimecomp_Run;

	public void blankPythonEditor() {
		txt_dsTimecomp_Editor.sendKeys("");
	}
	public void validPythonEditor() {
		txt_dsTimecomp_Editor.sendKeys("ecxel");
	}
	public void invalidPythonEditor() {
		txt_dsTimecomp_Editor.sendKeys("ecxel");
	}
	public void clickRunBtn() {
		btn_dsTimecomp_Run.click();
	}
}
