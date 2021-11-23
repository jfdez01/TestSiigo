package com.co.gao.stepdefinitions.falabella;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.co.gao.tasks.purchase.AddBagProductTask;
import com.co.gao.tasks.purchase.ExtendedWarrantyTask;
import com.co.gao.tasks.purchase.ShippingPriceTask;
import com.co.gao.tasks.purchase.VerifyExtendedWarrantyTask;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShippingPrice {
	
	@When("I add two products to the bag")
	public void iAddTwoProductsToTheBag() {
		theActorInTheSpotlight().attemptsTo(AddBagProductTask.gao());
		theActorInTheSpotlight().attemptsTo(ExtendedWarrantyTask.gao());
		theActorInTheSpotlight().attemptsTo(VerifyExtendedWarrantyTask.gao());
	}

	@Then("I validate the shipping price of the products")
	public void iValidateTheShippingPriceOfTheProducts() {
		theActorInTheSpotlight().attemptsTo(ShippingPriceTask.gao());
	}

}
