package com.co.gao.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/purchase/purchase.feature",
		tags = "@ShippingPrice",
		glue = "com.co.gao.stepdefinitions", snippets = SnippetType.CAMELCASE, monochrome = true, dryRun = false)

public final class RunnerPurchaseF {	
	
private RunnerPurchaseF() {
		
		throw new IllegalStateException("Runner class");
	}

}
