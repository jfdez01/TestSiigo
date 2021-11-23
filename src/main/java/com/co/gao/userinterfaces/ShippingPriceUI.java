package com.co.gao.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShippingPriceUI {
	
	public static final Target BTN_SELECT_DEPARMENT= Target.the("BTN_SELECT_DEPARMENT").located(By.id("region"));
	public static final Target BTN_DEPARMENT= Target.the("BTN_DEPARMENT").located(By.xpath("//*[@id=\"region\"]/option[2]"));
	public static final Target BTN_SELECT_CITY= Target.the("BTN_SELECT_CITY").located(By.name("ciudad"));
	public static final Target BTN_CITY= Target.the("BTN_CITY").located(By.xpath("//*[@id=\"ciudad\"]/option[40]"));
	public static final Target BTN_SELECT_NEIGHBORHOOD= Target.the("BTN_SELECT_NEIGHBORHOOD").located(By.name("comuna"));
	public static final Target BTN_NEIGHBORHOOD= Target.the("BTN_NEIGHBORHOOD").located(By.xpath("//*[@id=\"comuna\"]/option[2]"));
	public static final Target BTN_NEXT= Target.the("BTN_SELECT_DEPARMENT").located(By.xpath("//*[@id=\"fbra_checkoutRegionAndComuna\"]/div/section/section/form/div/div[4]/div/button"));
	
	//Verify
	public static final Target TXT_ADDRESS= Target.the("TXT_ADDRESS").located(By.id("address"));
	public static final Target TXT_ADDRESS_ADDITIONAL= Target.the("TXT_ADDRESS_ADDITIONAL").located(By.id("departmentNumber"));
	public static final Target BTN_ADD_ADDRESS= Target.the("BTN_ADD_ADDRESS").located(By.name("useAddress"));
	public static final Target BTN_CONTINUE= Target.the("BTN_CONTINUE").located(By.xpath("//*[@id=\"fbra_checkoutDeliveryActions\"]/div/div/span/div/div/div/div[2]/button"));
	
	
	private ShippingPriceUI() {
		throw new IllegalStateException("Utility class");
	}

}
