package com.co.gao.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchFalabellaUI {
	
	public static final Target TXT_SEARCH= Target.the("TXT_SEARCH").located(By.name("q"));
	public static final Target SELECT_SEARCH= Target.the("SELECT_SEARCH").located(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span"));
	public static final Target FIRTS_RESULT= Target.the("FIRTS_RESULT").located(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
	
	
	private SearchFalabellaUI() {
		throw new IllegalStateException("Utility class");
	}


}
