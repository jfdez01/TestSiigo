package com.co.gao.stepdefinitions.falabella;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.co.gao.tasks.purchase.AddBagProductTask;
import com.co.gao.tasks.purchase.ExtendedWarrantyTask;
import com.co.gao.tasks.purchase.VerifyExtendedWarrantyTask;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExtendedWarranty {
	
	@When("I add two product to the bag")
	public void iAddTwoProductToTheBag() {
		theActorInTheSpotlight().attemptsTo(AddBagProductTask.gao());
		theActorInTheSpotlight().attemptsTo(ExtendedWarrantyTask.gao());
	}

	@Then("I validate that the products was addeds to the bag")
	public void iValidateThatTheProductsWasAddedsToTheBag() {
		theActorInTheSpotlight().attemptsTo(VerifyExtendedWarrantyTask.gao());
		
	}

}
