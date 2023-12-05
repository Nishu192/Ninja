import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class submit {

	
	

public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dsportalapp.herokuapp.com/question/4");
	driver.findElement(By.xpath("//*[@id=\"answer_form\"]/input[2]")).click();
//	double s1=sub.getLocation().x;
//	double t1=sub.getLocation().y;
//	System.out.println(+s1+ "and "+t1);


}
}