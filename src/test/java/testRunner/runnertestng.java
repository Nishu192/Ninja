package testRunner;

import org.junit.runner.RunWith;



import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/feature"},
		glue = {"steppDef","appHook"},
		tags= "not @NotrunReg ",
	   
		//monochrome= true,
		
		plugin={"pretty","html:target/HtmlReport/report.html",
				"json:target/JSONReport/report.json",
				"junit:target/JUnitReport/report.xml",
				
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})		
		public class runnertestng extends AbstractTestNGCucumberTests{
		}
	
		
				
		
