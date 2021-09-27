package stepsDefinitions;

import static utils.Utils.acessarsistema;
import static utils.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void Setup1() {
		acessarsistema();
	}
	
	@After 
	public void TearDown1() {
	   driver.quit();
	}

}
