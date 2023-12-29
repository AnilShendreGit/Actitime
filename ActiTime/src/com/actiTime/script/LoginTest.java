package com.actiTime.script;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;

@Listeners(com.actiTime.generic.ListerImpliments.class)
public class LoginTest extends BaseClass {
	@Test
	public void testLogin() {
		Reporter.log("login is completed ", true );
	}
}
