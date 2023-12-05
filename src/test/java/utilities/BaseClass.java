
package utilities;

import java.io.FileReader;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BaseClass {
 //private static BaseClass Base;    
	
    private static WebDriver driver=null ;
    public final static int TIMEOUT = 2;
     public static Properties prop=new Properties();
     public static FileReader fr;
    
    public static void setUp() throws IOException {
    	if(driver==null) {
     fr=new FileReader	("C:/Users/enggn/eclipse-workspace/DS_AlgoCh/src/test/resources/configFiles/config.properties");
    	prop.load(fr);
    	}
    	
    	if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
    	{
    		driver=new ChromeDriver();
    		
    		driver.manage().window().maximize();
    		
    	}
    	else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
    	else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
    	{
    		driver=new EdgeDriver();
    		driver.manage().deleteAllCookies();
    		
    	}
    	else if(prop.getProperty("browser").equalsIgnoreCase("safari"))
    	{
    		driver=new SafariDriver();
    	}
    }
   
    
    
    

    public static String getDSurl() {
        return prop.getProperty("url") ;
    }
    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getCurrentUrl() {
    	return driver.getCurrentUrl();
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavFwd() {
        driver.navigate().forward();
       }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static  WebDriver getDriver() {
        return driver;
    }

    public static void navigateToUrl(String url) {
    	driver.navigate().to(url);
    	
    }
     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
        //driver=null;
     }
     public static void HomePage() {
     	driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
     	
     }
}
