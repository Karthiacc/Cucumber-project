package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import Baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooksclass extends Baseclass {
	
	@Before
	public void beforescenario() throws FileNotFoundException, IOException{
		typeofbrowser(getPropertyFileValue("browser"));
		browserlaunch(getPropertyFileValue("url"));
		
	}

	@After
	public void Afterscenario(Scenario scenario) {

		// boolean failed = scenario.isFailed();

		 scenario.attach(getscreenshot(), "image.png", "everyscenario");
		 quit();

	}
}
