package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class class_DemoTestNG {

	@Test
	public void testDemo() {
		//System.out.println("Welcome to TestNG");
		Reporter.log("Welcome to TestNG",true);
	}

}
