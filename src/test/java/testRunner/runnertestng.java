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
		
		plugin={"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})		
		public class runnertestng extends AbstractTestNGCucumberTests{
		}
	
		
				
		
