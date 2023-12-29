package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_Modue {

	@Test(priority=1,invocationCount=3)
	public void createCustomer() {
		Reporter.log("Create customer",true);
	}

	@Test(priority = 2,dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("Modify customer",true);
	}
	@Test(priority = 3,dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("Delete customer",true);
	}
}
