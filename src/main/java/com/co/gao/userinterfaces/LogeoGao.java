package com.co.gao.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LogeoGao {
	 
	 public static final Target BTN_CLOSE = Target.the("Close Alert")
	            .located(By.id("acc-alert-deny")); 
	 public static final Target BTN_LOGIN = Target.the("Login")
		        .located(By.xpath("//*[@id=\"testId-UserAction-userinfo\"]/div/div[2]/div/p"));
	 public static final Target TXT_NAME = Target.the("Name user")
			    .located(By.name("email"));
	 public static final Target TXT_PASS = Target.the("Password user")
			    .located(By.name("password"));
	 public static final Target BTN_ADMIT = Target.the("Button admit")
			    .located(By.id("testId-cc-login-form-submit"));
	 public static final Target BTN_CLOSE_FORM = Target.the("Close Form")
			    .located(By.id("testId-cc-modal-close-button"));
	 
	 	 
	 private LogeoGao() {
		    throw new IllegalStateException("Utility class");
		  }
	 
}
