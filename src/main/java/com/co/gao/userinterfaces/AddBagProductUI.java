package com.co.gao.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddBagProductUI {
	
	public static final Target TXT_SEARCH= Target.the("TXT_SEARCH").located(By.id("testId-SearchBar-Input"));
	public static final Target BTN_SEARCH= Target.the("BTN_SEARCH").located(By.xpath("//*[@id=\"testId-search-wrapper\"]/div/button/img"));
	public static final Target BTN_PRODUCT= Target.the("BTN_PRODUCT").located(By.id("testId-pod-image-17370790"));
	public static final Target BTN_ADDBAG= Target.the("BTN_ADDBAG").located(By.xpath("//*[@id=\"testId-Pod-action-17370790\"]/div/div"));
	public static final Target BTN_NEXTBUY= Target.the("BTN_NEXTBUY").located(By.xpath("/html/body/div[1]/div/div[2]/div[2]/section[2]/div/div[1]/div/div/div/div/div[3]/div/button"));
	
	
	
	//Verify
	public static final Target BTN_BAG= Target.the("BTN_BAG").located(By.xpath("//*[@id=\"testId-UserAction-basket\"]/div/a/i"));
	
	
	private AddBagProductUI() {
		throw new IllegalStateException("Utility class");
	}


}

