package appHook;


import io.cucumber.java.After;
import io.cucumber.java.Before;



public class hookScenario {


@Before()
public static void startScenario(){
	System.out.println("=================START SCENARIO===================================================");

	
}
@After()
public static void afterScenario(){
	
	
	System.out.println("==================END SCENARIO====================================================");
}
}
