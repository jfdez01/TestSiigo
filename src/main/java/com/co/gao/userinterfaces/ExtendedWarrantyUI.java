package com.co.gao.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ExtendedWarrantyUI {
	
	public static final Target TXT_SEARCH= Target.the("TXT_SEARCH").located(By.id("searchQuestion"));
	public static final Target BTN_PRODUCT= Target.the("BTN_PRODUCT").located(By.id("testId-pod-image-10476531"));
	public static final Target BTN_ADDBAG= Target.the("BTN_ADDBAG").located(By.xpath("//*[@id=\"testId-Pod-action-10476531\"]/div/div"));
	public static final Target BTN_VIEWBAG= Target.the("BTN_VIEWBAG").located(By.id("linkButton"));
	
	//Verify
	public static final Target BTN_SCROLL_WARRANT= Target.the("BTN_SCROLL_WARRANT").located(By.xpath("/html/body/div[1]/main/div[2]/div[1]/section[1]/section/div/div/div/form/div/a/span[1]"));
	public static final Target BTN_SELECT_WARRANT= Target.the("BTN_SELECT_WARRANT").located(By.xpath("/html/body/div[1]/main/div[2]/div[1]/section[1]/section/div/div/div/form/div/a"));
	public static final Target BTN_WARRANT= Target.the("BTN_WARRANT").located(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section[1]/section/div/div/div/form/div/div/ul/li[2]/a"));
	public static final Target BTN_SELECT_WARRANT2= Target.the("BTN_SELECT_WARRANT2").located(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section[2]/section/div/div/div/form/div/a/span[1]"));
	public static final Target BTN_WARRANT2= Target.the("BTN_WARRANT2").located(By.xpath("/html/body/div[1]/main/div[2]/div[1]/section[2]/section/div/div/div/form/div/div/ul/li[3]/a"));
	public static final Target BTN_BUY= Target.the("BTN_BUY").located(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));
	
	private ExtendedWarrantyUI() {
		throw new IllegalStateException("Utility class");
	}


}


